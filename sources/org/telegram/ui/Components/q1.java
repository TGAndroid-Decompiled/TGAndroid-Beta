package org.telegram.ui.Components;
public final class q1 implements Runnable {
    public final int f37123a;
    public final org.telegram.messenger.qr f37124b;

    public q1(org.telegram.messenger.qr qrVar, int i7) {
        this.f37123a = i7;
        this.f37124b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f37123a) {
            case 0:
                org.telegram.messenger.qr qrVar = this.f37124b;
                if (qrVar != null) {
                    qrVar.k(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.qr qrVar2 = this.f37124b;
                if (qrVar2 != null) {
                    qrVar2.k(false);
                    return;
                }
                return;
        }
    }
}
