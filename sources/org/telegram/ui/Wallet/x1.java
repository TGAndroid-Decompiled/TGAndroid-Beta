package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class x1 implements Runnable {
    public final int f35607a;
    public final boolean[] f35608b;
    public final z1 f35609c;
    public final h2 d;

    public x1(boolean[] zArr, z1 z1Var, h2 h2Var, int i10) {
        this.f35607a = i10;
        this.f35608b = zArr;
        this.f35609c = z1Var;
        this.d = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f35607a) {
            case 0:
                if (!this.f35608b[0]) {
                    if (this.f35609c.f35703m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35608b[0]) {
                    if (this.f35609c.f35703m) {
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
