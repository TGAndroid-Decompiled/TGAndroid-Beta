package org.telegram.ui;
public final class lq implements Runnable {
    public final int f35386a;
    public final pr f35387b;

    public lq(pr prVar, int i10) {
        this.f35386a = i10;
        this.f35387b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f35386a) {
            case 0:
                this.f35387b.r0();
                return;
            default:
                pr prVar = this.f35387b;
                prVar.getMessagesController().loadFullChat(prVar.N, 0, true);
                return;
        }
    }
}
