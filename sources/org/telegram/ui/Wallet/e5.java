package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class e5 implements Runnable {
    public final int f36515a;
    public final g5 f36516b;

    public e5(g5 g5Var, int i10) {
        this.f36515a = i10;
        this.f36516b = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f36515a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e5(this.f36516b, 1));
                return;
            default:
                this.f36516b.a();
                return;
        }
    }
}
