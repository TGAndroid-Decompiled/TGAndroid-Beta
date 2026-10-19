package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class h5 implements Runnable {
    public final int f34279a;
    public final j5 f34280b;

    public h5(j5 j5Var, int i10) {
        this.f34279a = i10;
        this.f34280b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f34279a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5(this.f34280b, 1));
                return;
            default:
                this.f34280b.a();
                return;
        }
    }
}
