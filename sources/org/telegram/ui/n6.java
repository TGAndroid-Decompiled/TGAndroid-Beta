package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n6 implements Runnable {
    public final int f35135a;
    public final boolean[] f35136b;
    public final q6 f35137c;
    public final long[] d;
    public final o6 e;

    public n6(boolean[] zArr, q6 q6Var, long[] jArr, o6 o6Var, int i10) {
        this.f35135a = i10;
        this.f35136b = zArr;
        this.f35137c = q6Var;
        this.d = jArr;
        this.e = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f35135a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n6(this.f35136b, this.f35137c, this.d, this.e, 1));
                return;
            default:
                this.f35136b[0] = true;
                this.f35137c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                o6 o6Var = this.e;
                if (j3 > 0) {
                    AndroidUtilities.runOnUIThread(new mu0(o6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    o6Var.dismiss();
                    return;
                }
        }
    }
}
