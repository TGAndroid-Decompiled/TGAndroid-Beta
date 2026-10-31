package org.telegram.ui.Wallet;
public final class y1 implements Runnable {
    public final int f35404a;
    public final boolean[] f35405b;
    public final a2 f35406c;
    public final y2 d;

    public y1(boolean[] zArr, a2 a2Var, y2 y2Var, int i10) {
        this.f35404a = i10;
        this.f35405b = zArr;
        this.f35406c = a2Var;
        this.d = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f35404a) {
            case 0:
                if (!this.f35405b[0]) {
                    if (this.f35406c.f34171m) {
                        org.telegram.messenger.i0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35405b[0]) {
                    if (this.f35406c.f34171m) {
                        org.telegram.messenger.i0.h3(this, 1000L);
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
