package org.telegram.ui;
public final class gr implements Runnable {
    public final int f48083a;
    public final qr f48084b;

    public gr(qr qrVar, int i7) {
        this.f48083a = i7;
        this.f48084b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f48083a) {
            case 0:
                qr.d0(this.f48084b);
                return;
            case 1:
                qr qrVar = this.f48084b;
                if (qrVar.K) {
                    qrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.I3(qrVar.d.d);
                    return;
                }
                return;
            default:
                qr qrVar2 = this.f48084b;
                qrVar2.presentFragment(bn.ua(qrVar2.I), true);
                return;
        }
    }
}
