package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m6 implements Runnable {
    public final int f39770a;
    public final boolean[] f39771b;
    public final q6 f39772c;
    public final long[] d;
    public final n6 f39773e;

    public m6(boolean[] zArr, q6 q6Var, long[] jArr, n6 n6Var, int i10) {
        this.f39770a = i10;
        this.f39771b = zArr;
        this.f39772c = q6Var;
        this.d = jArr;
        this.f39773e = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f39770a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m6(this.f39771b, this.f39772c, this.d, this.f39773e, 1));
                return;
            default:
                this.f39771b[0] = true;
                this.f39772c.a(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                n6 n6Var = this.f39773e;
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
