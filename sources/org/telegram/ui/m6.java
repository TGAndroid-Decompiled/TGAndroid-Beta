package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m6 implements Runnable {
    public final int f35578a;
    public final boolean[] f35579b;
    public final q6 f35580c;
    public final long[] d;
    public final n6 e;

    public m6(boolean[] zArr, q6 q6Var, long[] jArr, n6 n6Var, int i10) {
        this.f35578a = i10;
        this.f35579b = zArr;
        this.f35580c = q6Var;
        this.d = jArr;
        this.e = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f35578a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m6(this.f35579b, this.f35580c, this.d, this.e, 1));
                return;
            default:
                this.f35579b[0] = true;
                this.f35580c.a(1.0f);
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
