package org.telegram.ui;
public final class no implements Runnable {
    public final int f40852a;
    public final yo f40853b;

    public no(yo yoVar, int i10) {
        this.f40852a = i10;
        this.f40853b = yoVar;
    }

    @Override
    public final void run() {
        switch (this.f40852a) {
            case 0:
                yo yoVar = this.f40853b;
                yoVar.Y = true;
                yoVar.b0();
                return;
            case 1:
                yo yoVar2 = this.f40853b;
                yoVar2.T = yoVar2.getMessagesController().getChat(Long.valueOf(yoVar2.V));
                yoVar2.Y();
                return;
            case 2:
                this.f40853b.a0(false);
                return;
            case 3:
                yo yoVar3 = this.f40853b;
                yoVar3.Y = true;
                if (yoVar3.f44915a.length() > 0) {
                    yoVar3.W(yoVar3.f44915a.getText().toString());
                }
                yoVar3.b0();
                return;
            case 4:
                this.f40853b.Y();
                return;
            default:
                this.f40853b.a0(true);
                return;
        }
    }
}
