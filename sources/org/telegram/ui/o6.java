package org.telegram.ui;
public final class o6 implements Runnable {
    public final int f50551a;
    public final boolean[] f50552b;
    public final ai.h0 f50553c;
    public final long[] d;
    public final p6 f50554e;

    public o6(boolean[] zArr, ai.h0 h0Var, long[] jArr, p6 p6Var, int i7) {
        this.f50551a = i7;
        this.f50552b = zArr;
        this.f50553c = h0Var;
        this.d = jArr;
        this.f50554e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f50551a) {
            case 0:
                org.telegram.messenger.g0.g3(new o6(this.f50552b, this.f50553c, this.d, this.f50554e, 1));
                return;
            default:
                this.f50552b[0] = true;
                this.f50553c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p6 p6Var = this.f50554e;
                if (i7 > 0) {
                    org.telegram.messenger.g0.h3(new hq0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    p6Var.dismiss();
                    return;
                }
        }
    }
}
