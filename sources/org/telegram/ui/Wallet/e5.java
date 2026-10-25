package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class e5 implements Runnable {
    public final int f36512a;
    public final g5 f36513b;

    public e5(g5 g5Var, int i10) {
        this.f36512a = i10;
        this.f36513b = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f36512a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e5(this.f36513b, 1));
                return;
            default:
                this.f36513b.a();
                return;
        }
    }
}
