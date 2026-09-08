package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n6 implements Runnable {
    public final int f38862a;
    public final boolean[] f38863b;
    public final r6 f38864c;
    public final long[] d;
    public final o6 f38865e;

    public n6(boolean[] zArr, r6 r6Var, long[] jArr, o6 o6Var, int i10) {
        this.f38862a = i10;
        this.f38863b = zArr;
        this.f38864c = r6Var;
        this.d = jArr;
        this.f38865e = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f38862a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n6(this.f38863b, this.f38864c, this.d, this.f38865e, 1));
                return;
            default:
                this.f38863b[0] = true;
                this.f38864c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                o6 o6Var = this.f38865e;
                if (j3 > 0) {
                    AndroidUtilities.runOnUIThread(new lu0(o6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    o6Var.dismiss();
                    return;
                }
        }
    }
}
