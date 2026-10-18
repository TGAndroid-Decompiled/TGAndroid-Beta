package org.telegram.ui;
public final class eq implements Runnable {
    public final int f36589a;
    public final jr f36590b;

    public eq(jr jrVar, int i10) {
        this.f36589a = i10;
        this.f36590b = jrVar;
    }

    @Override
    public final void run() {
        switch (this.f36589a) {
            case 0:
                this.f36590b.r0();
                return;
            default:
                jr jrVar = this.f36590b;
                jrVar.getMessagesController().loadFullChat(jrVar.N, 0, true);
                return;
        }
    }
}
