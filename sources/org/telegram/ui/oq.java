package org.telegram.ui;
public final class oq implements Runnable {
    public final int f40586a;
    public final tr f40587b;

    public oq(tr trVar, int i10) {
        this.f40586a = i10;
        this.f40587b = trVar;
    }

    @Override
    public final void run() {
        switch (this.f40586a) {
            case 0:
                this.f40587b.r0();
                return;
            default:
                tr trVar = this.f40587b;
                trVar.getMessagesController().loadFullChat(trVar.N, 0, true);
                return;
        }
    }
}
