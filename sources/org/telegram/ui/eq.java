package org.telegram.ui;
public final class eq implements Runnable {
    public final int f37010a;
    public final jr f37011b;

    public eq(jr jrVar, int i10) {
        this.f37010a = i10;
        this.f37011b = jrVar;
    }

    @Override
    public final void run() {
        switch (this.f37010a) {
            case 0:
                this.f37011b.r0();
                return;
            default:
                jr jrVar = this.f37011b;
                jrVar.getMessagesController().loadFullChat(jrVar.N, 0, true);
                return;
        }
    }
}
