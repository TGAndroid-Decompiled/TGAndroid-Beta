package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class x1 implements Runnable {
    public final int f35644a;
    public final boolean[] f35645b;
    public final z1 f35646c;
    public final h2 d;

    public x1(boolean[] zArr, z1 z1Var, h2 h2Var, int i10) {
        this.f35644a = i10;
        this.f35645b = zArr;
        this.f35646c = z1Var;
        this.d = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f35644a) {
            case 0:
                if (!this.f35645b[0]) {
                    if (this.f35646c.f35730m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35645b[0]) {
                    if (this.f35646c.f35730m) {
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
