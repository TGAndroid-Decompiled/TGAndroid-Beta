package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class y1 implements Runnable {
    public final int f37493a;
    public final boolean[] f37494b;
    public final a2 f37495c;
    public final i2 d;

    public y1(boolean[] zArr, a2 a2Var, i2 i2Var, int i10) {
        this.f37493a = i10;
        this.f37494b = zArr;
        this.f37495c = a2Var;
        this.d = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f37493a) {
            case 0:
                if (!this.f37494b[0]) {
                    if (this.f37495c.f36346m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f37494b[0]) {
                    if (this.f37495c.f36346m) {
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
