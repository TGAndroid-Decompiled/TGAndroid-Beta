package org.telegram.ui;
public final class eq implements Runnable {
    public final int f36989a;
    public final jr f36990b;

    public eq(jr jrVar, int i10) {
        this.f36989a = i10;
        this.f36990b = jrVar;
    }

    @Override
    public final void run() {
        switch (this.f36989a) {
            case 0:
                this.f36990b.r0();
                return;
            default:
                jr jrVar = this.f36990b;
                jrVar.getMessagesController().loadFullChat(jrVar.N, 0, true);
                return;
        }
    }
}
