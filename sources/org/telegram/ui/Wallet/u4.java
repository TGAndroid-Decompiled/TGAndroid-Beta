package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class u4 implements Runnable {
    public final int f35415a;
    public final w4 f35416b;

    public u4(w4 w4Var, int i10) {
        this.f35415a = i10;
        this.f35416b = w4Var;
    }

    @Override
    public final void run() {
        switch (this.f35415a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u4(this.f35416b, 1));
                return;
            default:
                this.f35416b.a();
                return;
        }
    }
}
