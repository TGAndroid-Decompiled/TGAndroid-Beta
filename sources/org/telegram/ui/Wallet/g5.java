package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class g5 implements Runnable {
    public final int f34541a;
    public final i5 f34542b;

    public g5(i5 i5Var, int i10) {
        this.f34541a = i10;
        this.f34542b = i5Var;
    }

    @Override
    public final void run() {
        switch (this.f34541a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g5(this.f34542b, 1));
                return;
            default:
                this.f34542b.a();
                return;
        }
    }
}
