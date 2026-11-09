package org.telegram.ui;
public final class o6 implements Runnable {
    public final int f48353a;
    public final boolean[] f48354b;
    public final bi.x5 f48355c;
    public final long[] d;
    public final p6 f48356e;

    public o6(boolean[] zArr, bi.x5 x5Var, long[] jArr, p6 p6Var, int i7) {
        this.f48353a = i7;
        this.f48354b = zArr;
        this.f48355c = x5Var;
        this.d = jArr;
        this.f48356e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f48353a) {
            case 0:
                org.telegram.messenger.g0.h3(new o6(this.f48354b, this.f48355c, this.d, this.f48356e, 1));
                return;
            default:
                this.f48354b[0] = true;
                this.f48355c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p6 p6Var = this.f48356e;
                if (i7 > 0) {
                    org.telegram.messenger.g0.i3(new iq0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    p6Var.dismiss();
                    return;
                }
        }
    }
}
