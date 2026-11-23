package org.telegram.ui;
public final class n6 implements Runnable {
    public final int f50103a;
    public final boolean[] f50104b;
    public final ai.l0 f50105c;
    public final long[] d;
    public final o6 f50106e;

    public n6(boolean[] zArr, ai.l0 l0Var, long[] jArr, o6 o6Var, int i7) {
        this.f50103a = i7;
        this.f50104b = zArr;
        this.f50105c = l0Var;
        this.d = jArr;
        this.f50106e = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f50103a) {
            case 0:
                org.telegram.messenger.g0.g3(new n6(this.f50104b, this.f50105c, this.d, this.f50106e, 1));
                return;
            default:
                this.f50104b[0] = true;
                this.f50105c.f(1.0f);
                long[] jArr = this.d;
                int i7 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                o6 o6Var = this.f50106e;
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
