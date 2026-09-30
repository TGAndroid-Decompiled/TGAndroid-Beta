package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m6 implements Runnable {
    public final int f35491a;
    public final boolean[] f35492b;
    public final q6 f35493c;
    public final long[] d;
    public final n6 e;

    public m6(boolean[] zArr, q6 q6Var, long[] jArr, n6 n6Var, int i10) {
        this.f35491a = i10;
        this.f35492b = zArr;
        this.f35493c = q6Var;
        this.d = jArr;
        this.e = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f35491a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m6(this.f35492b, this.f35493c, this.d, this.e, 1));
                return;
            default:
                this.f35492b[0] = true;
                this.f35493c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                n6 n6Var = this.e;
                if (j3 > 0) {
                    AndroidUtilities.runOnUIThread(new eu0(n6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    n6Var.dismiss();
                    return;
                }
        }
    }
}
