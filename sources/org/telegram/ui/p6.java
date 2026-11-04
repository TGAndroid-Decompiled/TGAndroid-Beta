package org.telegram.ui;
public final class p6 implements Runnable {
    public final int f48472a;
    public final boolean[] f48473b;
    public final ai.c0 f48474c;
    public final long[] d;
    public final q6 f48475e;

    public p6(boolean[] zArr, ai.c0 c0Var, long[] jArr, q6 q6Var, int i3) {
        this.f48472a = i3;
        this.f48473b = zArr;
        this.f48474c = c0Var;
        this.d = jArr;
        this.f48475e = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f48472a) {
            case 0:
                org.telegram.messenger.g0.h3(new p6(this.f48473b, this.f48474c, this.d, this.f48475e, 1));
                return;
            default:
                this.f48473b[0] = true;
                this.f48474c.f(1.0f);
                long[] jArr = this.d;
                int i3 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                q6 q6Var = this.f48475e;
                if (i3 > 0) {
                    org.telegram.messenger.g0.i3(new xp0(q6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    q6Var.dismiss();
                    return;
                }
        }
    }
}
