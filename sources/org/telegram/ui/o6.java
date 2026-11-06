package org.telegram.ui;
public final class o6 implements Runnable {
    public final int f48279a;
    public final boolean[] f48280b;
    public final bi.x5 f48281c;
    public final long[] d;
    public final p6 f48282e;

    public o6(boolean[] zArr, bi.x5 x5Var, long[] jArr, p6 p6Var, int i7) {
        this.f48279a = i7;
        this.f48280b = zArr;
        this.f48281c = x5Var;
        this.d = jArr;
        this.f48282e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f48279a) {
            case 0:
                org.telegram.messenger.g0.h3(new o6(this.f48280b, this.f48281c, this.d, this.f48282e, 1));
                return;
            default:
                this.f48280b[0] = true;
                this.f48281c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p6 p6Var = this.f48282e;
                if (i7 > 0) {
                    org.telegram.messenger.g0.i3(new gq0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    p6Var.dismiss();
                    return;
                }
        }
    }
}
