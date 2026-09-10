package org.telegram.ui;
public final class bp implements Runnable {
    public final int f31310a;
    public final mp f31311b;

    public bp(mp mpVar, int i10) {
        this.f31310a = i10;
        this.f31311b = mpVar;
    }

    @Override
    public final void run() {
        switch (this.f31310a) {
            case 0:
                mp mpVar = this.f31311b;
                mpVar.f35020c0 = true;
                mpVar.b0();
                return;
            case 1:
                mp mpVar2 = this.f31311b;
                mpVar2.X = mpVar2.getMessagesController().getChat(Long.valueOf(mpVar2.Z));
                mpVar2.Y();
                return;
            case 2:
                this.f31311b.a0(false);
                return;
            case 3:
                mp mpVar3 = this.f31311b;
                mpVar3.f35020c0 = true;
                if (mpVar3.f35015a.length() > 0) {
                    mpVar3.W(mpVar3.f35015a.getText().toString());
                }
                mpVar3.b0();
                return;
            case 4:
                this.f31311b.Y();
                return;
            default:
                this.f31311b.a0(true);
                return;
        }
    }
}
