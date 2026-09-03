package org.telegram.ui;
public final class mq implements Runnable {
    public final int f36159a;
    public final rr f36160b;

    public mq(rr rrVar, int i10) {
        this.f36159a = i10;
        this.f36160b = rrVar;
    }

    @Override
    public final void run() {
        switch (this.f36159a) {
            case 0:
                this.f36160b.r0();
                return;
            default:
                rr rrVar = this.f36160b;
                rrVar.getMessagesController().loadFullChat(rrVar.K, 0, true);
                return;
        }
    }
}
