package org.telegram.ui;
public final class oq implements Runnable {
    public final int f40588a;
    public final tr f40589b;

    public oq(tr trVar, int i10) {
        this.f40588a = i10;
        this.f40589b = trVar;
    }

    @Override
    public final void run() {
        switch (this.f40588a) {
            case 0:
                this.f40589b.r0();
                return;
            default:
                tr trVar = this.f40589b;
                trVar.getMessagesController().loadFullChat(trVar.N, 0, true);
                return;
        }
    }
}
