package org.telegram.ui;
public final class oq implements Runnable {
    public final int f40595a;
    public final sr f40596b;

    public oq(sr srVar, int i10) {
        this.f40595a = i10;
        this.f40596b = srVar;
    }

    @Override
    public final void run() {
        switch (this.f40595a) {
            case 0:
                this.f40596b.r0();
                return;
            default:
                sr srVar = this.f40596b;
                srVar.getMessagesController().loadFullChat(srVar.N, 0, true);
                return;
        }
    }
}
