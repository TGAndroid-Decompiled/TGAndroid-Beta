package org.telegram.ui;
public final class no implements Runnable {
    public final int f39512a;
    public final yo f39513b;

    public no(yo yoVar, int i10) {
        this.f39512a = i10;
        this.f39513b = yoVar;
    }

    @Override
    public final void run() {
        switch (this.f39512a) {
            case 0:
                yo yoVar = this.f39513b;
                yoVar.f43463c0 = true;
                yoVar.b0();
                return;
            case 1:
                yo yoVar2 = this.f39513b;
                yoVar2.X = yoVar2.getMessagesController().getChat(Long.valueOf(yoVar2.Z));
                yoVar2.Y();
                return;
            case 2:
                this.f39513b.a0(false);
                return;
            case 3:
                yo yoVar3 = this.f39513b;
                yoVar3.f43463c0 = true;
                if (yoVar3.f43458a.length() > 0) {
                    yoVar3.W(yoVar3.f43458a.getText().toString());
                }
                yoVar3.b0();
                return;
            case 4:
                this.f39513b.Y();
                return;
            default:
                this.f39513b.a0(true);
                return;
        }
    }
}
