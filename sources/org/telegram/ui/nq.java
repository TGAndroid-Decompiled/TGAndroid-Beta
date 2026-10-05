package org.telegram.ui;
public final class nq implements Runnable {
    public final int f39020a;
    public final rr f39021b;

    public nq(rr rrVar, int i10) {
        this.f39020a = i10;
        this.f39021b = rrVar;
    }

    @Override
    public final void run() {
        switch (this.f39020a) {
            case 0:
                this.f39021b.r0();
                return;
            default:
                rr rrVar = this.f39021b;
                rrVar.getMessagesController().loadFullChat(rrVar.N, 0, true);
                return;
        }
    }
}
