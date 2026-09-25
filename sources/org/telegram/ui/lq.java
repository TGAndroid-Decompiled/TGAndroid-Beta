package org.telegram.ui;
public final class lq implements Runnable {
    public final int f35399a;
    public final pr f35400b;

    public lq(pr prVar, int i10) {
        this.f35399a = i10;
        this.f35400b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f35399a) {
            case 0:
                this.f35400b.r0();
                return;
            default:
                pr prVar = this.f35400b;
                prVar.getMessagesController().loadFullChat(prVar.N, 0, true);
                return;
        }
    }
}
