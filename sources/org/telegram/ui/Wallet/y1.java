package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class y1 implements Runnable {
    public final int f33602a;
    public final boolean[] f33603b;
    public final a2 f33604c;
    public final i2 d;

    public y1(boolean[] zArr, a2 a2Var, i2 i2Var, int i10) {
        this.f33602a = i10;
        this.f33603b = zArr;
        this.f33604c = a2Var;
        this.d = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f33602a) {
            case 0:
                if (!this.f33603b[0]) {
                    if (this.f33604c.f32626m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f33603b[0]) {
                    if (this.f33604c.f32626m) {
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
