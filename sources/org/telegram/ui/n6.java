package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class n6 implements Runnable {

    public final int f40673a;

    public final boolean[] f40674b;

    public final r6 f40675c;
    public final long[] d;

    public final o6 f40676e;

    public n6(boolean[] zArr, r6 r6Var, long[] jArr, o6 o6Var, int i10) {
        this.f40673a = i10;
        this.f40674b = zArr;
        this.f40675c = r6Var;
        this.d = jArr;
        this.f40676e = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f40673a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n6(this.f40674b, this.f40675c, this.d, this.f40676e, 1));
                break;
            default:
                this.f40674b[0] = true;
                this.f40675c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                o6 o6Var = this.f40676e;
                if (j10 <= 0) {
                    o6Var.dismiss();
                } else {
                    AndroidUtilities.runOnUIThread(new lt0(o6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                }
                break;
        }
    }
}
