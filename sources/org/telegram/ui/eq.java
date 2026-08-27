package org.telegram.ui;

public final class eq implements Runnable {

    public final int f37807a;

    public final lr f37808b;

    public eq(lr lrVar, int i10) {
        this.f37807a = i10;
        this.f37808b = lrVar;
    }

    @Override
    public final void run() {
        switch (this.f37807a) {
            case 0:
                this.f37808b.r0();
                break;
            default:
                lr lrVar = this.f37808b;
                lrVar.getMessagesController().loadFullChat(lrVar.J, 0, true);
                break;
        }
    }
}
