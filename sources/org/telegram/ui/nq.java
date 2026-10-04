package org.telegram.ui;
public final class nq implements Runnable {
    public final int f39026a;
    public final rr f39027b;

    public nq(rr rrVar, int i10) {
        this.f39026a = i10;
        this.f39027b = rrVar;
    }

    @Override
    public final void run() {
        switch (this.f39026a) {
            case 0:
                this.f39027b.r0();
                return;
            default:
                rr rrVar = this.f39027b;
                rrVar.getMessagesController().loadFullChat(rrVar.N, 0, true);
                return;
        }
    }
}
