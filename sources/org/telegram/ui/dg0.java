package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f31903a;
    public final u3 f31904b;

    public dg0(u3 u3Var, int i10) {
        this.f31903a = i10;
        this.f31904b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f31903a) {
            case 0:
                this.f31904b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f31904b, 0));
                return;
        }
    }
}
