package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class y1 implements Runnable {
    public final int f37490a;
    public final boolean[] f37491b;
    public final a2 f37492c;
    public final i2 d;

    public y1(boolean[] zArr, a2 a2Var, i2 i2Var, int i10) {
        this.f37490a = i10;
        this.f37491b = zArr;
        this.f37492c = a2Var;
        this.d = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f37490a) {
            case 0:
                if (!this.f37491b[0]) {
                    if (this.f37492c.f36343m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f37491b[0]) {
                    if (this.f37492c.f36343m) {
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
