package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class y1 implements Runnable {
    public final int f35430a;
    public final boolean[] f35431b;
    public final a2 f35432c;
    public final i2 d;

    public y1(boolean[] zArr, a2 a2Var, i2 i2Var, int i10) {
        this.f35430a = i10;
        this.f35431b = zArr;
        this.f35432c = a2Var;
        this.d = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f35430a) {
            case 0:
                if (!this.f35431b[0]) {
                    if (this.f35432c.f34283m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35431b[0]) {
                    if (this.f35432c.f34283m) {
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
