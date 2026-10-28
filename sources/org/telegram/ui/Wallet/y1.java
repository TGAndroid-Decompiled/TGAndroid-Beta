package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class y1 implements Runnable {
    public final int f37517a;
    public final boolean[] f37518b;
    public final a2 f37519c;
    public final i2 d;

    public y1(boolean[] zArr, a2 a2Var, i2 i2Var, int i10) {
        this.f37517a = i10;
        this.f37518b = zArr;
        this.f37519c = a2Var;
        this.d = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f37517a) {
            case 0:
                if (!this.f37518b[0]) {
                    if (this.f37519c.f36370m) {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f37518b[0]) {
                    if (this.f37519c.f36370m) {
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
