package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m6 implements Runnable {
    public final int f39816a;
    public final boolean[] f39817b;
    public final q6 f39818c;
    public final long[] d;
    public final n6 f39819e;

    public m6(boolean[] zArr, q6 q6Var, long[] jArr, n6 n6Var, int i10) {
        this.f39816a = i10;
        this.f39817b = zArr;
        this.f39818c = q6Var;
        this.d = jArr;
        this.f39819e = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f39816a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m6(this.f39817b, this.f39818c, this.d, this.f39819e, 1));
                return;
            default:
                this.f39817b[0] = true;
                this.f39818c.a(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                n6 n6Var = this.f39819e;
                if (i10 > 0) {
                    AndroidUtilities.runOnUIThread(new nu0(n6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    n6Var.dismiss();
                    return;
                }
        }
    }
}
