package org.telegram.ui;
public final class hq implements Runnable {
    public final int f40054a;
    public final kr f40055b;

    public hq(kr krVar, int i10) {
        this.f40054a = i10;
        this.f40055b = krVar;
    }

    @Override
    public final void run() {
        switch (this.f40054a) {
            case 0:
                this.f40055b.s0();
                return;
            default:
                kr krVar = this.f40055b;
                krVar.getMessagesController().loadFullChat(krVar.M, 0, true);
                return;
        }
    }
}
