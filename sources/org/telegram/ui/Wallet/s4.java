package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class s4 implements Runnable {
    public final int f35482a;
    public final u4 f35483b;

    public s4(u4 u4Var, int i10) {
        this.f35482a = i10;
        this.f35483b = u4Var;
    }

    @Override
    public final void run() {
        switch (this.f35482a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s4(this.f35483b, 1));
                return;
            default:
                this.f35483b.a();
                return;
        }
    }
}
