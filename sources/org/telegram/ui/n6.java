package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n6 implements Runnable {
    public final int f38835a;
    public final boolean[] f38836b;
    public final r6 f38837c;
    public final long[] d;
    public final o6 f38838e;

    public n6(boolean[] zArr, r6 r6Var, long[] jArr, o6 o6Var, int i10) {
        this.f38835a = i10;
        this.f38836b = zArr;
        this.f38837c = r6Var;
        this.d = jArr;
        this.f38838e = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f38835a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n6(this.f38836b, this.f38837c, this.d, this.f38838e, 1));
                return;
            default:
                this.f38836b[0] = true;
                this.f38837c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                o6 o6Var = this.f38838e;
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
