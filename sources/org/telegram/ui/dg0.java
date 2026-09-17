package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f35811a;
    public final t3 f35812b;

    public dg0(t3 t3Var, int i10) {
        this.f35811a = i10;
        this.f35812b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f35811a) {
            case 0:
                this.f35812b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f35812b, 0));
                return;
        }
    }
}
