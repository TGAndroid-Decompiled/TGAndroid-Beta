package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class h5 implements Runnable {
    public final int f34289a;
    public final j5 f34290b;

    public h5(j5 j5Var, int i10) {
        this.f34289a = i10;
        this.f34290b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f34289a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5(this.f34290b, 1));
                return;
            default:
                this.f34290b.a();
                return;
        }
    }
}
