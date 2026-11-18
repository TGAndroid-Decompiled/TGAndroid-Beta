package org.telegram.ui;
public final class n6 implements Runnable {
    public final int f50070a;
    public final boolean[] f50071b;
    public final ai.k0 f50072c;
    public final long[] d;
    public final o6 f50073e;

    public n6(boolean[] zArr, ai.k0 k0Var, long[] jArr, o6 o6Var, int i7) {
        this.f50070a = i7;
        this.f50071b = zArr;
        this.f50072c = k0Var;
        this.d = jArr;
        this.f50073e = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f50070a) {
            case 0:
                org.telegram.messenger.g0.g3(new n6(this.f50071b, this.f50072c, this.d, this.f50073e, 1));
                return;
            default:
                this.f50071b[0] = true;
                this.f50072c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                o6 o6Var = this.f50073e;
                if (i7 > 0) {
                    org.telegram.messenger.g0.h3(new hq0(o6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    o6Var.dismiss();
                    return;
                }
        }
    }
}
