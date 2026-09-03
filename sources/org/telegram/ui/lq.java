package org.telegram.ui;
public final class lq implements Runnable {
    public final int f38759a;
    public final qr f38760b;

    public lq(qr qrVar, int i10) {
        this.f38759a = i10;
        this.f38760b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f38759a) {
            case 0:
                this.f38760b.r0();
                return;
            default:
                qr qrVar = this.f38760b;
                qrVar.getMessagesController().loadFullChat(qrVar.K, 0, true);
                return;
        }
    }
}
