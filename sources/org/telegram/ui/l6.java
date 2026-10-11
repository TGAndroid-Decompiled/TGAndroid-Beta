package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l6 implements Runnable {
    public final int f39517a;
    public final boolean[] f39518b;
    public final p6 f39519c;
    public final long[] d;
    public final m6 f39520e;

    public l6(boolean[] zArr, p6 p6Var, long[] jArr, m6 m6Var, int i10) {
        this.f39517a = i10;
        this.f39518b = zArr;
        this.f39519c = p6Var;
        this.d = jArr;
        this.f39520e = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f39517a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l6(this.f39518b, this.f39519c, this.d, this.f39520e, 1));
                return;
            default:
                this.f39518b[0] = true;
                this.f39519c.a(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                m6 m6Var = this.f39520e;
                if (i10 > 0) {
                    AndroidUtilities.runOnUIThread(new mu0(m6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    m6Var.dismiss();
                    return;
                }
        }
    }
}
