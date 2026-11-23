package org.telegram.ui;
public final class n6 implements Runnable {
    public final int f50089a;
    public final boolean[] f50090b;
    public final ai.g0 f50091c;
    public final long[] d;
    public final o6 f50092e;

    public n6(boolean[] zArr, ai.g0 g0Var, long[] jArr, o6 o6Var, int i7) {
        this.f50089a = i7;
        this.f50090b = zArr;
        this.f50091c = g0Var;
        this.d = jArr;
        this.f50092e = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f50089a) {
            case 0:
                org.telegram.messenger.g0.g3(new n6(this.f50090b, this.f50091c, this.d, this.f50092e, 1));
                return;
            default:
                this.f50090b[0] = true;
                this.f50091c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                o6 o6Var = this.f50092e;
                if (i7 > 0) {
                    org.telegram.messenger.g0.h3(new iq0(o6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    o6Var.dismiss();
                    return;
                }
        }
    }
}
