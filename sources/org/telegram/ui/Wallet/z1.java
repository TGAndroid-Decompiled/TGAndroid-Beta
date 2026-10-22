package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35169a;
    public final boolean[] f35170b;
    public final b2 f35171c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35169a = i10;
        this.f35170b = zArr;
        this.f35171c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35169a) {
            case 0:
                if (!this.f35170b[0]) {
                    if (this.f35171c.f34028m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35170b[0]) {
                    if (this.f35171c.f34028m) {
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
