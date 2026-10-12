package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35580a;
    public final boolean[] f35581b;
    public final b2 f35582c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35580a = i10;
        this.f35581b = zArr;
        this.f35582c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35580a) {
            case 0:
                if (!this.f35581b[0]) {
                    if (this.f35582c.f34497m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35581b[0]) {
                    if (this.f35582c.f34497m) {
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
