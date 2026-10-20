package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class h5 implements Runnable {
    public final int f34285a;
    public final j5 f34286b;

    public h5(j5 j5Var, int i10) {
        this.f34285a = i10;
        this.f34286b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f34285a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5(this.f34286b, 1));
                return;
            default:
                this.f34286b.a();
                return;
        }
    }
}
