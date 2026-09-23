package org.telegram.ui;
public final class mq implements Runnable {
    public final int f35373a;
    public final qr f35374b;

    public mq(qr qrVar, int i10) {
        this.f35373a = i10;
        this.f35374b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f35373a) {
            case 0:
                this.f35374b.r0();
                return;
            default:
                qr qrVar = this.f35374b;
                qrVar.getMessagesController().loadFullChat(qrVar.N, 0, true);
                return;
        }
    }
}
