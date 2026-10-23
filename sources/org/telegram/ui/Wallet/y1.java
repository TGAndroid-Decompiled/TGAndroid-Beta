package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class y1 implements Runnable {
    public final int f35428a;
    public final boolean[] f35429b;
    public final a2 f35430c;
    public final i2 d;

    public y1(boolean[] zArr, a2 a2Var, i2 i2Var, int i10) {
        this.f35428a = i10;
        this.f35429b = zArr;
        this.f35430c = a2Var;
        this.d = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f35428a) {
            case 0:
                if (!this.f35429b[0]) {
                    if (this.f35430c.f34281m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35429b[0]) {
                    if (this.f35430c.f34281m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
