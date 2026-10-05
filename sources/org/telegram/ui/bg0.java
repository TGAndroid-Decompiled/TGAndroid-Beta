package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bg0 implements Runnable {
    public final int f35136a;
    public final t3 f35137b;

    public bg0(t3 t3Var, int i10) {
        this.f35136a = i10;
        this.f35137b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f35136a) {
            case 0:
                this.f35137b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new bg0(this.f35137b, 0));
                return;
        }
    }
}
