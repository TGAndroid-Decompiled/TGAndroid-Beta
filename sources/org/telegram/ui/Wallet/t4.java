package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class t4 implements Runnable {
    public final int f33457a;
    public final v4 f33458b;

    public t4(v4 v4Var, int i10) {
        this.f33457a = i10;
        this.f33458b = v4Var;
    }

    @Override
    public final void run() {
        switch (this.f33457a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t4(this.f33458b, 1));
                return;
            default:
                this.f33458b.a();
                return;
        }
    }
}
