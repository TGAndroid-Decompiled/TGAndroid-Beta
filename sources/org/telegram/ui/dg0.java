package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f36803a;
    public final t3 f36804b;

    public dg0(t3 t3Var, int i10) {
        this.f36803a = i10;
        this.f36804b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f36803a) {
            case 0:
                this.f36804b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f36804b, 0));
                return;
        }
    }
}
