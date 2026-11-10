package org.telegram.ui;
public final class gr implements Runnable {
    public final int f46148a;
    public final qr f46149b;

    public gr(qr qrVar, int i7) {
        this.f46148a = i7;
        this.f46149b = qrVar;
    }

    @Override
    public final void run() {
        switch (this.f46148a) {
            case 0:
                qr.d0(this.f46149b);
                return;
            case 1:
                qr qrVar = this.f46149b;
                if (qrVar.J) {
                    qrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(qrVar.d.d);
                    return;
                }
                return;
            default:
                qr qrVar2 = this.f46149b;
                qrVar2.presentFragment(cn.ta(qrVar2.H), true);
                return;
        }
    }
}
