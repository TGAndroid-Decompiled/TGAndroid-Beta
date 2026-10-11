package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35802a;
    public final boolean[] f35803b;
    public final b2 f35804c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35802a = i10;
        this.f35803b = zArr;
        this.f35804c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35802a) {
            case 0:
                if (!this.f35803b[0]) {
                    if (this.f35804c.f34720m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35803b[0]) {
                    if (this.f35804c.f34720m) {
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
