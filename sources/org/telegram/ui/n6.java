package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n6 implements Runnable {
    public final int f35822a;
    public final boolean[] f35823b;
    public final r6 f35824c;
    public final long[] d;
    public final o6 e;

    public n6(boolean[] zArr, r6 r6Var, long[] jArr, o6 o6Var, int i10) {
        this.f35822a = i10;
        this.f35823b = zArr;
        this.f35824c = r6Var;
        this.d = jArr;
        this.e = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f35822a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n6(this.f35823b, this.f35824c, this.d, this.e, 1));
                return;
            default:
                this.f35823b[0] = true;
                this.f35824c.a(1.0f);
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
