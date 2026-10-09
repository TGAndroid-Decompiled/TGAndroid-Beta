package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f36959a;
    public final t3 f36960b;

    public dg0(t3 t3Var, int i10) {
        this.f36959a = i10;
        this.f36960b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f36959a) {
            case 0:
                this.f36960b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f36960b, 0));
                return;
        }
    }
}
