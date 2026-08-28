package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m6 implements Runnable {
    public final int f40335a;
    public final boolean[] f40336b;
    public final q6 f40337c;
    public final long[] d;
    public final n6 f40338e;

    public m6(boolean[] zArr, q6 q6Var, long[] jArr, n6 n6Var, int i9) {
        this.f40335a = i9;
        this.f40336b = zArr;
        this.f40337c = q6Var;
        this.d = jArr;
        this.f40338e = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f40335a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m6(this.f40336b, this.f40337c, this.d, this.f40338e, 1));
                return;
            default:
                this.f40336b[0] = true;
                this.f40337c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                n6 n6Var = this.f40338e;
                if (j10 > 0) {
                    AndroidUtilities.runOnUIThread(new kt0(n6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    n6Var.dismiss();
                    return;
                }
        }
    }
}
