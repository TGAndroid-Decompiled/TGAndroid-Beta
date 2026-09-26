package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m6 implements Runnable {
    public final int f35487a;
    public final boolean[] f35488b;
    public final q6 f35489c;
    public final long[] d;
    public final n6 e;

    public m6(boolean[] zArr, q6 q6Var, long[] jArr, n6 n6Var, int i10) {
        this.f35487a = i10;
        this.f35488b = zArr;
        this.f35489c = q6Var;
        this.d = jArr;
        this.e = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f35487a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m6(this.f35488b, this.f35489c, this.d, this.e, 1));
                return;
            default:
                this.f35488b[0] = true;
                this.f35489c.a(1.0f);
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
