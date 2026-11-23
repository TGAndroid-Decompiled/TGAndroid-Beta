package org.telegram.ui.Wallet;
public final class g2 implements Runnable {
    public final int f44338a;
    public final boolean[] f44339b;
    public final i2 f44340c;
    public final e3 d;

    public g2(boolean[] zArr, i2 i2Var, e3 e3Var, int i7) {
        this.f44338a = i7;
        this.f44339b = zArr;
        this.f44340c = i2Var;
        this.d = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f44338a) {
            case 0:
                if (!this.f44339b[0]) {
                    if (this.f44340c.f44471m) {
                        org.telegram.messenger.g0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f44339b[0]) {
                    if (this.f44340c.f44471m) {
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
