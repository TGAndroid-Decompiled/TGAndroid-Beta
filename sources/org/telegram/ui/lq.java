package org.telegram.ui;
public final class lq implements Runnable {
    public final int f38837a;
    public final qr f38838b;

    public lq(qr qrVar, int i10) {
        this.f38837a = i10;
        this.f38838b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f38837a) {
            case 0:
                this.f38838b.r0();
                return;
            default:
                qr qrVar = this.f38838b;
                qrVar.getMessagesController().loadFullChat(qrVar.K, 0, true);
                return;
        }
    }
}
