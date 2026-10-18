package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class g5 implements Runnable {
    public final int f34224a;
    public final i5 f34225b;

    public g5(i5 i5Var, int i10) {
        this.f34224a = i10;
        this.f34225b = i5Var;
    }

    @Override
    public final void run() {
        switch (this.f34224a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g5(this.f34225b, 1));
                return;
            default:
                this.f34225b.a();
                return;
        }
    }
}
