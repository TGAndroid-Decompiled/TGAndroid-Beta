package org.telegram.ui.Wallet;
public final class w1 implements Runnable {
    public final int f43309a;
    public final boolean[] f43310b;
    public final y1 f43311c;
    public final x2 d;

    public w1(boolean[] zArr, y1 y1Var, x2 x2Var, int i3) {
        this.f43309a = i3;
        this.f43310b = zArr;
        this.f43311c = y1Var;
        this.d = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f43309a) {
            case 0:
                if (!this.f43310b[0]) {
                    if (this.f43311c.f43466m) {
                        org.telegram.messenger.g0.i3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f43310b[0]) {
                    if (this.f43311c.f43466m) {
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
