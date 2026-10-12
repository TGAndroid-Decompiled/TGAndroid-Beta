package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class x1 implements Runnable {
    public final int f33830a;
    public final boolean[] f33831b;
    public final z1 f33832c;
    public final h2 d;

    public x1(boolean[] zArr, z1 z1Var, h2 h2Var, int i10) {
        this.f33830a = i10;
        this.f33831b = zArr;
        this.f33832c = z1Var;
        this.d = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f33830a) {
            case 0:
                if (!this.f33831b[0]) {
                    if (this.f33832c.f33909m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f33831b[0]) {
                    if (this.f33832c.f33909m) {
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
