package org.telegram.ui;
public final class oq implements Runnable {
    public final int f40632a;
    public final tr f40633b;

    public oq(tr trVar, int i10) {
        this.f40632a = i10;
        this.f40633b = trVar;
    }

    @Override
    public final void run() {
        switch (this.f40632a) {
            case 0:
                this.f40633b.r0();
                return;
            default:
                tr trVar = this.f40633b;
                trVar.getMessagesController().loadFullChat(trVar.N, 0, true);
                return;
        }
    }
}
