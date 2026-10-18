package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f35161a;
    public final boolean[] f35162b;
    public final b2 f35163c;
    public final j2 d;

    public z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.f35161a = i10;
        this.f35162b = zArr;
        this.f35163c = b2Var;
        this.d = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f35161a) {
            case 0:
                if (!this.f35162b[0]) {
                    if (this.f35163c.f34006m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35162b[0]) {
                    if (this.f35163c.f34006m) {
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
