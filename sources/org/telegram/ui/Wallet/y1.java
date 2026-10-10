package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class y1 implements Runnable {
    public final int f35738a;
    public final boolean[] f35739b;
    public final a2 f35740c;
    public final i2 d;

    public y1(boolean[] zArr, a2 a2Var, i2 i2Var, int i10) {
        this.f35738a = i10;
        this.f35739b = zArr;
        this.f35740c = a2Var;
        this.d = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f35738a) {
            case 0:
                if (!this.f35739b[0]) {
                    if (this.f35740c.f34658m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35739b[0]) {
                    if (this.f35740c.f34658m) {
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
