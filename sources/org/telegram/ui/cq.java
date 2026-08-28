package org.telegram.ui;
public final class cq implements Runnable {
    public final int f37286a;
    public final jr f37287b;

    public cq(jr jrVar, int i9) {
        this.f37286a = i9;
        this.f37287b = jrVar;
    }

    @Override
    public final void run() {
        switch (this.f37286a) {
            case 0:
                this.f37287b.q0();
                return;
            default:
                jr jrVar = this.f37287b;
                jrVar.getMessagesController().loadFullChat(jrVar.J, 0, true);
                return;
        }
    }
}
