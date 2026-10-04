package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p6 implements Runnable {
    public final int f39347a;
    public final boolean[] f39348b;
    public final t6 f39349c;
    public final long[] d;
    public final q6 f39350e;

    public p6(boolean[] zArr, t6 t6Var, long[] jArr, q6 q6Var, int i10) {
        this.f39347a = i10;
        this.f39348b = zArr;
        this.f39349c = t6Var;
        this.d = jArr;
        this.f39350e = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f39347a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(this.f39348b, this.f39349c, this.d, this.f39350e, 1));
                return;
            default:
                this.f39348b[0] = true;
                this.f39349c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                q6 q6Var = this.f39350e;
                if (j3 > 0) {
                    AndroidUtilities.runOnUIThread(new hu0(q6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    q6Var.dismiss();
                    return;
                }
        }
    }
}
