package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p6 implements Runnable {
    public final int f40857a;
    public final boolean[] f40858b;
    public final t6 f40859c;
    public final long[] d;
    public final q6 f40860e;

    public p6(boolean[] zArr, t6 t6Var, long[] jArr, q6 q6Var, int i10) {
        this.f40857a = i10;
        this.f40858b = zArr;
        this.f40859c = t6Var;
        this.d = jArr;
        this.f40860e = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f40857a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(this.f40858b, this.f40859c, this.d, this.f40860e, 1));
                return;
            default:
                this.f40858b[0] = true;
                this.f40859c.a(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                q6 q6Var = this.f40860e;
                if (i10 > 0) {
                    AndroidUtilities.runOnUIThread(new pu0(q6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    q6Var.dismiss();
                    return;
                }
        }
    }
}
