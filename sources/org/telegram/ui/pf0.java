package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pf0 implements Runnable {
    public final int f42393a;
    public final t3 f42394b;

    public pf0(t3 t3Var, int i10) {
        this.f42393a = i10;
        this.f42394b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f42393a) {
            case 0:
                this.f42394b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new pf0(this.f42394b, 0));
                return;
        }
    }
}
