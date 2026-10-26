package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nf0 implements Runnable {
    public final int f41886a;
    public final t3 f41887b;

    public nf0(t3 t3Var, int i10) {
        this.f41886a = i10;
        this.f41887b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f41886a) {
            case 0:
                this.f41887b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new nf0(this.f41887b, 0));
                return;
        }
    }
}
