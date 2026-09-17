package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class o6 implements Runnable {
    public final int f36234a;
    public final boolean[] f36235b;
    public final s6 f36236c;
    public final long[] d;
    public final p6 e;

    public o6(boolean[] zArr, s6 s6Var, long[] jArr, p6 p6Var, int i10) {
        this.f36234a = i10;
        this.f36235b = zArr;
        this.f36236c = s6Var;
        this.d = jArr;
        this.e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f36234a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o6(this.f36235b, this.f36236c, this.d, this.e, 1));
                return;
            default:
                this.f36235b[0] = true;
                this.f36236c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                p6 p6Var = this.e;
                if (j3 > 0) {
                    AndroidUtilities.runOnUIThread(new ou0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    p6Var.dismiss();
                    return;
                }
        }
    }
}
