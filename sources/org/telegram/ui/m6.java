package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m6 implements Runnable {
    public final int f40437a;
    public final boolean[] f40438b;
    public final p6 f40439c;
    public final long[] d;
    public final n6 f40440e;

    public m6(boolean[] zArr, p6 p6Var, long[] jArr, n6 n6Var, int i10) {
        this.f40437a = i10;
        this.f40438b = zArr;
        this.f40439c = p6Var;
        this.d = jArr;
        this.f40440e = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f40437a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m6(this.f40438b, this.f40439c, this.d, this.f40440e, 1));
                return;
            default:
                this.f40438b[0] = true;
                this.f40439c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                n6 n6Var = this.f40440e;
                if (j10 > 0) {
                    AndroidUtilities.runOnUIThread(new it0(n6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    n6Var.dismiss();
                    return;
                }
        }
    }
}
