package org.telegram.ui.Components;
public final class r1 implements Runnable {
    public final int f37476a;
    public final org.telegram.messenger.qr f37477b;

    public r1(org.telegram.messenger.qr qrVar, int i7) {
        this.f37476a = i7;
        this.f37477b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f37476a) {
            case 0:
                org.telegram.messenger.qr qrVar = this.f37477b;
                if (qrVar != null) {
                    qrVar.k(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.qr qrVar2 = this.f37477b;
                if (qrVar2 != null) {
                    qrVar2.k(false);
                    return;
                }
                return;
        }
    }
}
