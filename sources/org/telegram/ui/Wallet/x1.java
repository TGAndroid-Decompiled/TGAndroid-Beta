package org.telegram.ui.Wallet;
public final class x1 implements Runnable {
    public final int f43300a;
    public final boolean[] f43301b;
    public final z1 f43302c;
    public final x2 d;

    public x1(boolean[] zArr, z1 z1Var, x2 x2Var, int i7) {
        this.f43300a = i7;
        this.f43301b = zArr;
        this.f43302c = z1Var;
        this.d = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f43300a) {
            case 0:
                if (!this.f43301b[0]) {
                    if (this.f43302c.f43415m) {
                        org.telegram.messenger.g0.i3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f43301b[0]) {
                    if (this.f43302c.f43415m) {
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
