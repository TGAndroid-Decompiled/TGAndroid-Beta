package org.telegram.ui.Components;
public final class r1 implements Runnable {
    public final int f37564a;
    public final org.telegram.messenger.qr f37565b;

    public r1(org.telegram.messenger.qr qrVar, int i7) {
        this.f37564a = i7;
        this.f37565b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f37564a) {
            case 0:
                org.telegram.messenger.qr qrVar = this.f37565b;
                if (qrVar != null) {
                    qrVar.k(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.qr qrVar2 = this.f37565b;
                if (qrVar2 != null) {
                    qrVar2.k(false);
                    return;
                }
                return;
        }
    }
}
