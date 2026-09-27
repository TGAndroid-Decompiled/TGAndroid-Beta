package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p6 implements Runnable {
    public final int f36335a;
    public final boolean[] f36336b;
    public final t6 f36337c;
    public final long[] d;
    public final q6 e;

    public p6(boolean[] zArr, t6 t6Var, long[] jArr, q6 q6Var, int i10) {
        this.f36335a = i10;
        this.f36336b = zArr;
        this.f36337c = t6Var;
        this.d = jArr;
        this.e = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f36335a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(this.f36336b, this.f36337c, this.d, this.e, 1));
                return;
            default:
                this.f36336b[0] = true;
                this.f36337c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                q6 q6Var = this.e;
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
