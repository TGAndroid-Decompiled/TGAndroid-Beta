package org.telegram.ui;
public final class eq implements Runnable {
    public final int f37883a;
    public final jr f37884b;

    public eq(jr jrVar, int i10) {
        this.f37883a = i10;
        this.f37884b = jrVar;
    }

    @Override
    public final void run() {
        switch (this.f37883a) {
            case 0:
                this.f37884b.r0();
                return;
            default:
                jr jrVar = this.f37884b;
                jrVar.getMessagesController().loadFullChat(jrVar.J, 0, true);
                return;
        }
    }
}
