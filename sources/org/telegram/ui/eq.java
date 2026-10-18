package org.telegram.ui;
public final class eq implements Runnable {
    public final int f36605a;
    public final jr f36606b;

    public eq(jr jrVar, int i10) {
        this.f36605a = i10;
        this.f36606b = jrVar;
    }

    @Override
    public final void run() {
        switch (this.f36605a) {
            case 0:
                this.f36606b.r0();
                return;
            default:
                jr jrVar = this.f36606b;
                jrVar.getMessagesController().loadFullChat(jrVar.N, 0, true);
                return;
        }
    }
}
