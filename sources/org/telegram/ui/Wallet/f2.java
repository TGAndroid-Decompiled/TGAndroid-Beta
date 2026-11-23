package org.telegram.ui.Wallet;
public final class f2 implements Runnable {
    public final int f44207a;
    public final boolean[] f44208b;
    public final h2 f44209c;
    public final d3 d;

    public f2(boolean[] zArr, h2 h2Var, d3 d3Var, int i7) {
        this.f44207a = i7;
        this.f44208b = zArr;
        this.f44209c = h2Var;
        this.d = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f44207a) {
            case 0:
                if (!this.f44208b[0]) {
                    if (this.f44209c.f44343m) {
                        org.telegram.messenger.g0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f44208b[0]) {
                    if (this.f44209c.f44343m) {
                        org.telegram.messenger.g0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
