package Calculator_01;
import java.util.Scanner; //JavaのScannerクラスをインポートし、ユーザー側から情報を受け取れるようにするコード文
//Caluculatorクラスのメインメソッド設定
public class Calculator {
    public static void main(String[] args) {
        //変数の宣言・初期化
        Scanner scanner = new Scanner(System.in); //System.inで入力を受け付けるようにする
        System.out.println("最初の数値を入力してください");

        //小数点以下の計算を可能にする型・変数宣言
        double num1 = scanner.nextInt();

        System.out.println("演算子を入力してください");
        char operator = scanner.next().charAt(0);//char型の変数operatorを宣言→

        System.out.println("次の数値を入力してください");
        double num2 = scanner.nextInt();
        double result = 0;
        //ここからユーザー側の入力による計算結果の条件分岐
        switch (operator) {
            //各ケース毎の分岐コード
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                //割り切れない数値を入力した場合、計算結果を条件分岐する
                if (num2 != 0) {
                    result = num1 / num2;
                }
                else {
                    System.out.println("無効な演算です");
                    return; //最初に返るようにする
                }
                break;
        }
        System.out.println("計算結果" + result);
    }
}