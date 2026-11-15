package org.telegram.ui;
public final class o6 implements Runnable {
    public final int f49813a;
    public final boolean[] f49814b;
    public final ai.k0 f49815c;
    public final long[] d;
    public final p6 f49816e;

    public o6(boolean[] zArr, ai.k0 k0Var, long[] jArr, p6 p6Var, int i7) {
        this.f49813a = i7;
        this.f49814b = zArr;
        this.f49815c = k0Var;
        this.d = jArr;
        this.f49816e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f49813a) {
            case 0:
                org.telegram.messenger.g0.h3(new o6(this.f49814b, this.f49815c, this.d, this.f49816e, 1));
                return;
            default:
                this.f49814b[0] = true;
                this.f49815c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p6 p6Var = this.f49816e;
                if (i7 > 0) {
                    org.telegram.messenger.g0.i3(new fq0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    p6Var.dismiss();
                    return;
                }
        }
    }
}
