package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class u4 implements Runnable {
    public final int f35639a;
    public final w4 f35640b;

    public u4(w4 w4Var, int i10) {
        this.f35639a = i10;
        this.f35640b = w4Var;
    }

    @Override
    public final void run() {
        switch (this.f35639a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u4(this.f35640b, 1));
                return;
            default:
                this.f35640b.a();
                return;
        }
    }
}
