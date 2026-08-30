package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q6 implements Runnable {
    public final int f37590a;
    public final boolean[] f37591b;
    public final t6 f37592c;
    public final long[] d;
    public final r6 e;

    public q6(boolean[] zArr, t6 t6Var, long[] jArr, r6 r6Var, int i10) {
        this.f37590a = i10;
        this.f37591b = zArr;
        this.f37592c = t6Var;
        this.d = jArr;
        this.e = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f37590a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q6(this.f37591b, this.f37592c, this.d, this.e, 1));
                return;
            default:
                this.f37591b[0] = true;
                this.f37592c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                r6 r6Var = this.e;
                if (j10 > 0) {
                    AndroidUtilities.runOnUIThread(new rt0(r6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    r6Var.dismiss();
                    return;
                }
        }
    }
}
