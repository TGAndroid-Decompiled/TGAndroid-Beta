package org.telegram.ui;
public final class o6 implements Runnable {
    public final int f48251a;
    public final boolean[] f48252b;
    public final bi.x5 f48253c;
    public final long[] d;
    public final p6 f48254e;

    public o6(boolean[] zArr, bi.x5 x5Var, long[] jArr, p6 p6Var, int i7) {
        this.f48251a = i7;
        this.f48252b = zArr;
        this.f48253c = x5Var;
        this.d = jArr;
        this.f48254e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f48251a) {
            case 0:
                org.telegram.messenger.g0.h3(new o6(this.f48252b, this.f48253c, this.d, this.f48254e, 1));
                return;
            default:
                this.f48252b[0] = true;
                this.f48253c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p6 p6Var = this.f48254e;
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
