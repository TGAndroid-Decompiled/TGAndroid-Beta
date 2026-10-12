package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class s4 implements Runnable {
    public final int f33683a;
    public final u4 f33684b;

    public s4(u4 u4Var, int i10) {
        this.f33683a = i10;
        this.f33684b = u4Var;
    }

    @Override
    public final void run() {
        switch (this.f33683a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s4(this.f33684b, 1));
                return;
            default:
                this.f33684b.a();
                return;
        }
    }
}
