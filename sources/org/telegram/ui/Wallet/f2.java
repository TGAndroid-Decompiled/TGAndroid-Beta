package org.telegram.ui.Wallet;
public final class f2 implements Runnable {
    public final int f44203a;
    public final boolean[] f44204b;
    public final h2 f44205c;
    public final d3 d;

    public f2(boolean[] zArr, h2 h2Var, d3 d3Var, int i7) {
        this.f44203a = i7;
        this.f44204b = zArr;
        this.f44205c = h2Var;
        this.d = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f44203a) {
            case 0:
                if (!this.f44204b[0]) {
                    if (this.f44205c.f44339m) {
                        org.telegram.messenger.g0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f44204b[0]) {
                    if (this.f44205c.f44339m) {
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
