package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class h5 implements Runnable {
    public final int f34290a;
    public final j5 f34291b;

    public h5(j5 j5Var, int i10) {
        this.f34290a = i10;
        this.f34291b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f34290a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5(this.f34291b, 1));
                return;
            default:
                this.f34291b.a();
                return;
        }
    }
}
