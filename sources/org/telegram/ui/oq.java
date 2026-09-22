package org.telegram.ui;
public final class oq implements Runnable {
    public final int f36380a;
    public final sr f36381b;

    public oq(sr srVar, int i10) {
        this.f36380a = i10;
        this.f36381b = srVar;
    }

    @Override
    public final void run() {
        switch (this.f36380a) {
            case 0:
                this.f36381b.r0();
                return;
            default:
                sr srVar = this.f36381b;
                srVar.getMessagesController().loadFullChat(srVar.N, 0, true);
                return;
        }
    }
}
