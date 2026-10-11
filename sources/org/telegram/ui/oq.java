package org.telegram.ui;
public final class oq implements Runnable {
    public final int f40629a;
    public final sr f40630b;

    public oq(sr srVar, int i10) {
        this.f40629a = i10;
        this.f40630b = srVar;
    }

    @Override
    public final void run() {
        switch (this.f40629a) {
            case 0:
                this.f40630b.r0();
                return;
            default:
                sr srVar = this.f40630b;
                srVar.getMessagesController().loadFullChat(srVar.N, 0, true);
                return;
        }
    }
}
