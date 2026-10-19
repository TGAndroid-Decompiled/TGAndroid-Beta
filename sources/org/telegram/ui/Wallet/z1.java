package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35157a;
    public final boolean[] f35158b;
    public final b2 f35159c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35157a = i10;
        this.f35158b = zArr;
        this.f35159c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35157a) {
            case 0:
                if (!this.f35158b[0]) {
                    if (this.f35159c.f34016m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35158b[0]) {
                    if (this.f35159c.f34016m) {
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
