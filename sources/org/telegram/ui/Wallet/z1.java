package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35165a;
    public final boolean[] f35166b;
    public final b2 f35167c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35165a = i10;
        this.f35166b = zArr;
        this.f35167c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35165a) {
            case 0:
                if (!this.f35166b[0]) {
                    if (this.f35167c.f34024m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35166b[0]) {
                    if (this.f35167c.f34024m) {
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
