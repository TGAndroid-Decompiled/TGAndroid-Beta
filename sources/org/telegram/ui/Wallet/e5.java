package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class e5 implements Runnable {
    public final int f34166a;
    public final g5 f34167b;

    public e5(g5 g5Var, int i10) {
        this.f34166a = i10;
        this.f34167b = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f34166a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e5(this.f34167b, 1));
                return;
            default:
                this.f34167b.a();
                return;
        }
    }
}
