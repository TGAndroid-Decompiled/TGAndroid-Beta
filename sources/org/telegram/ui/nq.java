package org.telegram.ui;
public final class nq implements Runnable {
    public final int f39031a;
    public final rr f39032b;

    public nq(rr rrVar, int i10) {
        this.f39031a = i10;
        this.f39032b = rrVar;
    }

    @Override
    public final void run() {
        switch (this.f39031a) {
            case 0:
                this.f39032b.r0();
                return;
            default:
                rr rrVar = this.f39032b;
                rrVar.getMessagesController().loadFullChat(rrVar.N, 0, true);
                return;
        }
    }
}
