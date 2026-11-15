package org.telegram.ui;
public final class o6 implements Runnable {
    public final int f49823a;
    public final boolean[] f49824b;
    public final ai.j0 f49825c;
    public final long[] d;
    public final p6 f49826e;

    public o6(boolean[] zArr, ai.j0 j0Var, long[] jArr, p6 p6Var, int i7) {
        this.f49823a = i7;
        this.f49824b = zArr;
        this.f49825c = j0Var;
        this.d = jArr;
        this.f49826e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f49823a) {
            case 0:
                org.telegram.messenger.g0.h3(new o6(this.f49824b, this.f49825c, this.d, this.f49826e, 1));
                return;
            default:
                this.f49824b[0] = true;
                this.f49825c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p6 p6Var = this.f49826e;
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
