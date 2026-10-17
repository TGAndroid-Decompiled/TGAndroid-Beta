package org.telegram.ui;
public final class eq implements Runnable {
    public final int f36582a;
    public final jr f36583b;

    public eq(jr jrVar, int i10) {
        this.f36582a = i10;
        this.f36583b = jrVar;
    }

    @Override
    public final void run() {
        switch (this.f36582a) {
            case 0:
                this.f36583b.r0();
                return;
            default:
                jr jrVar = this.f36583b;
                jrVar.getMessagesController().loadFullChat(jrVar.N, 0, true);
                return;
        }
    }
}
