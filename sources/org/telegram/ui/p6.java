package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p6 implements Runnable {
    public final int f39353a;
    public final boolean[] f39354b;
    public final t6 f39355c;
    public final long[] d;
    public final q6 f39356e;

    public p6(boolean[] zArr, t6 t6Var, long[] jArr, q6 q6Var, int i10) {
        this.f39353a = i10;
        this.f39354b = zArr;
        this.f39355c = t6Var;
        this.d = jArr;
        this.f39356e = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f39353a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(this.f39354b, this.f39355c, this.d, this.f39356e, 1));
                return;
            default:
                this.f39354b[0] = true;
                this.f39355c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                q6 q6Var = this.f39356e;
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
