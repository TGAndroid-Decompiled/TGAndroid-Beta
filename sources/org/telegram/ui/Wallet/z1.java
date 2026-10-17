package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35189a;
    public final boolean[] f35190b;
    public final b2 f35191c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35189a = i10;
        this.f35190b = zArr;
        this.f35191c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35189a) {
            case 0:
                if (!this.f35190b[0]) {
                    if (this.f35191c.f34028m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35190b[0]) {
                    if (this.f35191c.f34028m) {
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
