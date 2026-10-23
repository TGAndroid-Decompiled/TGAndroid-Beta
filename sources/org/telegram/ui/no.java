package org.telegram.ui;
public final class no implements Runnable {
    public final int f39933a;
    public final yo f39934b;

    public no(yo yoVar, int i10) {
        this.f39933a = i10;
        this.f39934b = yoVar;
    }

    @Override
    public final void run() {
        switch (this.f39933a) {
            case 0:
                yo yoVar = this.f39934b;
                yoVar.f43918d0 = true;
                yoVar.c0();
                return;
            case 1:
                yo yoVar2 = this.f39934b;
                yoVar2.Y = yoVar2.getMessagesController().getChat(Long.valueOf(yoVar2.f43913a0));
                yoVar2.Z();
                return;
            case 2:
                this.f39934b.b0(false);
                return;
            case 3:
                yo yoVar3 = this.f39934b;
                yoVar3.f43918d0 = true;
                if (yoVar3.f43912a.length() > 0) {
                    yoVar3.X(yoVar3.f43912a.getText().toString());
                }
                yoVar3.c0();
                return;
            case 4:
                this.f39934b.Z();
                return;
            default:
                this.f39934b.b0(true);
                return;
        }
    }
}
