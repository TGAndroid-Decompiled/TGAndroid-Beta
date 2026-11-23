package org.telegram.ui.Wallet;
public final class f2 implements Runnable {
    public final int f44173a;
    public final boolean[] f44174b;
    public final h2 f44175c;
    public final d3 d;

    public f2(boolean[] zArr, h2 h2Var, d3 d3Var, int i7) {
        this.f44173a = i7;
        this.f44174b = zArr;
        this.f44175c = h2Var;
        this.d = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f44173a) {
            case 0:
                if (!this.f44174b[0]) {
                    if (this.f44175c.f44309m) {
                        org.telegram.messenger.g0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f44174b[0]) {
                    if (this.f44175c.f44309m) {
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
