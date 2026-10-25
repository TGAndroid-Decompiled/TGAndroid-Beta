package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nf0 implements Runnable {
    public final int f41883a;
    public final t3 f41884b;

    public nf0(t3 t3Var, int i10) {
        this.f41883a = i10;
        this.f41884b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f41883a) {
            case 0:
                this.f41884b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new nf0(this.f41884b, 0));
                return;
        }
    }
}
