package org.telegram.ui.Wallet;
public final class x1 implements Runnable {
    public final int f44674a;
    public final boolean[] f44675b;
    public final z1 f44676c;
    public final w2 d;

    public x1(boolean[] zArr, z1 z1Var, w2 w2Var, int i7) {
        this.f44674a = i7;
        this.f44675b = zArr;
        this.f44676c = z1Var;
        this.d = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f44674a) {
            case 0:
                if (!this.f44675b[0]) {
                    if (this.f44676c.f44786m) {
                        org.telegram.messenger.g0.i3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f44675b[0]) {
                    if (this.f44676c.f44786m) {
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
