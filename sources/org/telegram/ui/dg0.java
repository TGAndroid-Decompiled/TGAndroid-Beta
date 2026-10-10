package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f37003a;
    public final t3 f37004b;

    public dg0(t3 t3Var, int i10) {
        this.f37003a = i10;
        this.f37004b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f37003a) {
            case 0:
                this.f37004b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f37004b, 0));
                return;
        }
    }
}
