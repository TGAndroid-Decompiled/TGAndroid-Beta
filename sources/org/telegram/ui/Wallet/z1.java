package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35768a;
    public final boolean[] f35769b;
    public final b2 f35770c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35768a = i10;
        this.f35769b = zArr;
        this.f35770c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35768a) {
            case 0:
                if (!this.f35769b[0]) {
                    if (this.f35770c.f34686m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35769b[0]) {
                    if (this.f35770c.f34686m) {
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
