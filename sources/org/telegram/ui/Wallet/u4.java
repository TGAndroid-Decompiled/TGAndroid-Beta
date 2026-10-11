package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class u4 implements Runnable {
    public final int f35605a;
    public final w4 f35606b;

    public u4(w4 w4Var, int i10) {
        this.f35605a = i10;
        this.f35606b = w4Var;
    }

    @Override
    public final void run() {
        switch (this.f35605a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u4(this.f35606b, 1));
                return;
            default:
                this.f35606b.a();
                return;
        }
    }
}
