package org.telegram.ui.Wallet;
public final class x1 implements Runnable {
    public final int f43318a;
    public final boolean[] f43319b;
    public final z1 f43320c;
    public final x2 d;

    public x1(boolean[] zArr, z1 z1Var, x2 x2Var, int i7) {
        this.f43318a = i7;
        this.f43319b = zArr;
        this.f43320c = z1Var;
        this.d = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f43318a) {
            case 0:
                if (!this.f43319b[0]) {
                    if (this.f43320c.f43422m) {
                        org.telegram.messenger.g0.i3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f43319b[0]) {
                    if (this.f43320c.f43422m) {
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
