package org.telegram.ui;
public final class no implements Runnable {
    public final int f39925a;
    public final yo f39926b;

    public no(yo yoVar, int i10) {
        this.f39925a = i10;
        this.f39926b = yoVar;
    }

    @Override
    public final void run() {
        switch (this.f39925a) {
            case 0:
                yo yoVar = this.f39926b;
                yoVar.f43905d0 = true;
                yoVar.c0();
                return;
            case 1:
                yo yoVar2 = this.f39926b;
                yoVar2.Y = yoVar2.getMessagesController().getChat(Long.valueOf(yoVar2.f43900a0));
                yoVar2.Z();
                return;
            case 2:
                this.f39926b.b0(false);
                return;
            case 3:
                yo yoVar3 = this.f39926b;
                yoVar3.f43905d0 = true;
                if (yoVar3.f43899a.length() > 0) {
                    yoVar3.X(yoVar3.f43899a.getText().toString());
                }
                yoVar3.c0();
                return;
            case 4:
                this.f39926b.Z();
                return;
            default:
                this.f39926b.b0(true);
                return;
        }
    }
}
