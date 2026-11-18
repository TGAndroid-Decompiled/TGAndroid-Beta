package org.telegram.ui.Wallet;
public final class f2 implements Runnable {
    public final int f44163a;
    public final boolean[] f44164b;
    public final h2 f44165c;
    public final d3 d;

    public f2(boolean[] zArr, h2 h2Var, d3 d3Var, int i7) {
        this.f44163a = i7;
        this.f44164b = zArr;
        this.f44165c = h2Var;
        this.d = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f44163a) {
            case 0:
                if (!this.f44164b[0]) {
                    if (this.f44165c.f44299m) {
                        org.telegram.messenger.g0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f44164b[0]) {
                    if (this.f44165c.f44299m) {
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
