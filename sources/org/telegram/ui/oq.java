package org.telegram.ui;
public final class oq implements Runnable {
    public final int f36225a;
    public final sr f36226b;

    public oq(sr srVar, int i10) {
        this.f36225a = i10;
        this.f36226b = srVar;
    }

    @Override
    public final void run() {
        switch (this.f36225a) {
            case 0:
                this.f36226b.r0();
                return;
            default:
                sr srVar = this.f36226b;
                srVar.getMessagesController().loadFullChat(srVar.N, 0, true);
                return;
        }
    }
}
