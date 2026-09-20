package org.telegram.ui;
public final class oq implements Runnable {
    public final int f36353a;
    public final sr f36354b;

    public oq(sr srVar, int i10) {
        this.f36353a = i10;
        this.f36354b = srVar;
    }

    @Override
    public final void run() {
        switch (this.f36353a) {
            case 0:
                this.f36354b.r0();
                return;
            default:
                sr srVar = this.f36354b;
                srVar.getMessagesController().loadFullChat(srVar.N, 0, true);
                return;
        }
    }
}
