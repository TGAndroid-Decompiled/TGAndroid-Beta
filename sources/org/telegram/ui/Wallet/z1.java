package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35159a;
    public final boolean[] f35160b;
    public final b2 f35161c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35159a = i10;
        this.f35160b = zArr;
        this.f35161c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35159a) {
            case 0:
                if (!this.f35160b[0]) {
                    if (this.f35161c.f34018m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35160b[0]) {
                    if (this.f35161c.f34018m) {
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
