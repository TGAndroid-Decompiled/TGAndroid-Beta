package org.telegram.ui;
public final class lq implements Runnable {
    public final int f35397a;
    public final pr f35398b;

    public lq(pr prVar, int i10) {
        this.f35397a = i10;
        this.f35398b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f35397a) {
            case 0:
                this.f35398b.r0();
                return;
            default:
                pr prVar = this.f35398b;
                prVar.getMessagesController().loadFullChat(prVar.N, 0, true);
                return;
        }
    }
}
