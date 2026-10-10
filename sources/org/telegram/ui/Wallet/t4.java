package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class t4 implements Runnable {
    public final int f35575a;
    public final v4 f35576b;

    public t4(v4 v4Var, int i10) {
        this.f35575a = i10;
        this.f35576b = v4Var;
    }

    @Override
    public final void run() {
        switch (this.f35575a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t4(this.f35576b, 1));
                return;
            default:
                this.f35576b.a();
                return;
        }
    }
}
