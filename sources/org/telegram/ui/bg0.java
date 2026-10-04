package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bg0 implements Runnable {
    public final int f35083a;
    public final t3 f35084b;

    public bg0(t3 t3Var, int i10) {
        this.f35083a = i10;
        this.f35084b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f35083a) {
            case 0:
                this.f35084b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new bg0(this.f35084b, 0));
                return;
        }
    }
}
