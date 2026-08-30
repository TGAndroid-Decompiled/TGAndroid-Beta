package org.telegram.ui;
public final class kq implements Runnable {
    public final int f35785a;
    public final pr f35786b;

    public kq(pr prVar, int i10) {
        this.f35785a = i10;
        this.f35786b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f35785a) {
            case 0:
                this.f35786b.r0();
                return;
            default:
                pr prVar = this.f35786b;
                prVar.getMessagesController().loadFullChat(prVar.K, 0, true);
                return;
        }
    }
}
