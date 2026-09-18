package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class o6 implements Runnable {
    public final int f36239a;
    public final boolean[] f36240b;
    public final s6 f36241c;
    public final long[] d;
    public final p6 e;

    public o6(boolean[] zArr, s6 s6Var, long[] jArr, p6 p6Var, int i10) {
        this.f36239a = i10;
        this.f36240b = zArr;
        this.f36241c = s6Var;
        this.d = jArr;
        this.e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f36239a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o6(this.f36240b, this.f36241c, this.d, this.e, 1));
                return;
            default:
                this.f36240b[0] = true;
                this.f36241c.a(1.0f);
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
