package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35170a;
    public final boolean[] f35171b;
    public final b2 f35172c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35170a = i10;
        this.f35171b = zArr;
        this.f35172c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35170a) {
            case 0:
                if (!this.f35171b[0]) {
                    if (this.f35172c.f34029m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35171b[0]) {
                    if (this.f35172c.f34029m) {
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
