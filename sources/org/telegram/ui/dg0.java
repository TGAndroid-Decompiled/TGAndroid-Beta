package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f35810a;
    public final t3 f35811b;

    public dg0(t3 t3Var, int i10) {
        this.f35810a = i10;
        this.f35811b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f35810a) {
            case 0:
                this.f35811b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f35811b, 0));
                return;
        }
    }
}
