package org.telegram.ui;
public final class mq implements Runnable {
    public final int f35742a;
    public final qr f35743b;

    public mq(qr qrVar, int i10) {
        this.f35742a = i10;
        this.f35743b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f35742a) {
            case 0:
                this.f35743b.r0();
                return;
            default:
                qr qrVar = this.f35743b;
                qrVar.getMessagesController().loadFullChat(qrVar.N, 0, true);
                return;
        }
    }
}
