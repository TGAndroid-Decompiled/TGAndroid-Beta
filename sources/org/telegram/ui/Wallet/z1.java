package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35578a;
    public final boolean[] f35579b;
    public final b2 f35580c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35578a = i10;
        this.f35579b = zArr;
        this.f35580c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35578a) {
            case 0:
                if (!this.f35579b[0]) {
                    if (this.f35580c.f34495m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35579b[0]) {
                    if (this.f35580c.f34495m) {
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
