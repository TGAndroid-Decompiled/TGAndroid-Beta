package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class h5 implements Runnable {
    public final int f34277a;
    public final j5 f34278b;

    public h5(j5 j5Var, int i10) {
        this.f34277a = i10;
        this.f34278b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f34277a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5(this.f34278b, 1));
                return;
            default:
                this.f34278b.a();
                return;
        }
    }
}
