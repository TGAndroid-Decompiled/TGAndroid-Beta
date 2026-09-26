package org.telegram.ui;
public final class lq implements Runnable {
    public final int f35398a;
    public final pr f35399b;

    public lq(pr prVar, int i10) {
        this.f35398a = i10;
        this.f35399b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f35398a) {
            case 0:
                this.f35399b.r0();
                return;
            default:
                pr prVar = this.f35399b;
                prVar.getMessagesController().loadFullChat(prVar.N, 0, true);
                return;
        }
    }
}
