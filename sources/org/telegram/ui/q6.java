package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q6 implements Runnable {
    public final int f40341a;
    public final boolean[] f40342b;
    public final t6 f40343c;
    public final long[] d;
    public final r6 f40344e;

    public q6(boolean[] zArr, t6 t6Var, long[] jArr, r6 r6Var, int i10) {
        this.f40341a = i10;
        this.f40342b = zArr;
        this.f40343c = t6Var;
        this.d = jArr;
        this.f40344e = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f40341a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q6(this.f40342b, this.f40343c, this.d, this.f40344e, 1));
                return;
            default:
                this.f40342b[0] = true;
                this.f40343c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                r6 r6Var = this.f40344e;
                if (j10 > 0) {
                    AndroidUtilities.runOnUIThread(new yt0(r6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    r6Var.dismiss();
                    return;
                }
        }
    }
}
