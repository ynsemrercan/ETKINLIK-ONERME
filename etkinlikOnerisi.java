import java.util.Scanner;
public class etkinlikOnerisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;

        System.out.println("Hava Sıcaklığını Giriniz: ");
        heat=input.nextInt();

        if(heat<5){

            System.out.println("Kayak Yapabilirsiniz ");
        }
        else if(heat>=10 && heat<=15) {

            System.out.println("Sinemaya veya Pikniğe gidebilirsiniz");

        }
        else if (heat>=5 && heat<=15 ){

            System.out.println("Sinemaya Gidebilirsiz");

        }

        else if (heat>=10 && heat<=25){

            System.out.println("Pikniğe Gidebilirsiniz ");
        }
        else {

            System.out.println("Yüzmeye Gidebilirsiz ");
        }




    }
}