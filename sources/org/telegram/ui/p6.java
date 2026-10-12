package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p6 implements Runnable {
    public final int f40859a;
    public final boolean[] f40860b;
    public final t6 f40861c;
    public final long[] d;
    public final q6 f40862e;

    public p6(boolean[] zArr, t6 t6Var, long[] jArr, q6 q6Var, int i10) {
        this.f40859a = i10;
        this.f40860b = zArr;
        this.f40861c = t6Var;
        this.d = jArr;
        this.f40862e = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f40859a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(this.f40860b, this.f40861c, this.d, this.f40862e, 1));
                return;
            default:
                this.f40860b[0] = true;
                this.f40861c.a(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                q6 q6Var = this.f40862e;
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
