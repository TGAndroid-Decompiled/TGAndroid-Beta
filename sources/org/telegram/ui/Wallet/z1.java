package org.telegram.ui.Wallet;
public final class z1 implements Runnable {
    public final int f43386a;
    public final boolean[] f43387b;
    public final b2 f43388c;
    public final z2 d;

    public z1(boolean[] zArr, b2 b2Var, z2 z2Var, int i7) {
        this.f43386a = i7;
        this.f43387b = zArr;
        this.f43388c = b2Var;
        this.d = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f43386a) {
            case 0:
                if (!this.f43387b[0]) {
                    if (this.f43388c.f42107m) {
                        org.telegram.messenger.g0.i3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f43387b[0]) {
                    if (this.f43388c.f42107m) {
                        org.telegram.messenger.g0.i3(this, 1000L);
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
