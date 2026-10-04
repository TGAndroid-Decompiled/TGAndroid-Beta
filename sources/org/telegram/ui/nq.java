package org.telegram.ui;
public final class nq implements Runnable {
    public final int f39025a;
    public final rr f39026b;

    public nq(rr rrVar, int i10) {
        this.f39025a = i10;
        this.f39026b = rrVar;
    }

    @Override
    public final void run() {
        switch (this.f39025a) {
            case 0:
                this.f39026b.r0();
                return;
            default:
                rr rrVar = this.f39026b;
                rrVar.getMessagesController().loadFullChat(rrVar.N, 0, true);
                return;
        }
    }
}
