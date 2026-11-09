package org.telegram.ui.Components;
public final class r1 implements Runnable {
    public final int f37525a;
    public final org.telegram.messenger.qr f37526b;

    public r1(org.telegram.messenger.qr qrVar, int i7) {
        this.f37525a = i7;
        this.f37526b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f37525a) {
            case 0:
                org.telegram.messenger.qr qrVar = this.f37526b;
                if (qrVar != null) {
                    qrVar.k(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.qr qrVar2 = this.f37526b;
                if (qrVar2 != null) {
                    qrVar2.k(false);
                    return;
                }
                return;
        }
    }
}
