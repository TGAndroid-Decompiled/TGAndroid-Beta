package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q6 implements Runnable {
    public final int f40480a;
    public final boolean[] f40481b;
    public final u6 f40482c;
    public final long[] d;
    public final r6 e;

    public q6(boolean[] zArr, u6 u6Var, long[] jArr, r6 r6Var, int i10) {
        this.f40480a = i10;
        this.f40481b = zArr;
        this.f40482c = u6Var;
        this.d = jArr;
        this.e = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f40480a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q6(this.f40481b, this.f40482c, this.d, this.e, 1));
                return;
            default:
                this.f40481b[0] = true;
                this.f40482c.a(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                r6 r6Var = this.e;
                if (i10 > 0) {
                    AndroidUtilities.runOnUIThread(new st0(r6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    r6Var.dismiss();
                    return;
                }
        }
    }
}
