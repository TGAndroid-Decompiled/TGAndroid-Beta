package org.telegram.ui;
public final class lq implements Runnable {
    public final int f35488a;
    public final pr f35489b;

    public lq(pr prVar, int i10) {
        this.f35488a = i10;
        this.f35489b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f35488a) {
            case 0:
                this.f35489b.r0();
                return;
            default:
                pr prVar = this.f35489b;
                prVar.getMessagesController().loadFullChat(prVar.N, 0, true);
                return;
        }
    }
}
