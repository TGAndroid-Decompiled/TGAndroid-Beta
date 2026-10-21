package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class h5 implements Runnable {
    public final int f34286a;
    public final j5 f34287b;

    public h5(j5 j5Var, int i10) {
        this.f34286a = i10;
        this.f34287b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f34286a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5(this.f34287b, 1));
                return;
            default:
                this.f34287b.a();
                return;
        }
    }
}
