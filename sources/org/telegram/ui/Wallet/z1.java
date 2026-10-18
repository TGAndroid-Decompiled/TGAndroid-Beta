package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35164a;
    public final boolean[] f35165b;
    public final b2 f35166c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35164a = i10;
        this.f35165b = zArr;
        this.f35166c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35164a) {
            case 0:
                if (!this.f35165b[0]) {
                    if (this.f35166c.f34025m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35165b[0]) {
                    if (this.f35166c.f34025m) {
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
