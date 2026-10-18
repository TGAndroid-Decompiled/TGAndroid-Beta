package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class f5 implements Runnable {
    public final int f34232a;
    public final h5 f34233b;

    public f5(h5 h5Var, int i10) {
        this.f34232a = i10;
        this.f34233b = h5Var;
    }

    @Override
    public final void run() {
        switch (this.f34232a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f5(this.f34233b, 1));
                return;
            default:
                this.f34233b.a();
                return;
        }
    }
}
