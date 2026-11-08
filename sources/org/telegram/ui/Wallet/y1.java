package org.telegram.ui.Wallet;
public final class y1 implements Runnable {
    public final int f43382a;
    public final boolean[] f43383b;
    public final a2 f43384c;
    public final y2 d;

    public y1(boolean[] zArr, a2 a2Var, y2 y2Var, int i7) {
        this.f43382a = i7;
        this.f43383b = zArr;
        this.f43384c = a2Var;
        this.d = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f43382a) {
            case 0:
                if (!this.f43383b[0]) {
                    if (this.f43384c.f42103m) {
                        org.telegram.messenger.g0.i3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f43383b[0]) {
                    if (this.f43384c.f42103m) {
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
