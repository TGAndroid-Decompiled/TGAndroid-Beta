package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f35783a;
    public final t3 f35784b;

    public dg0(t3 t3Var, int i10) {
        this.f35783a = i10;
        this.f35784b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f35783a) {
            case 0:
                this.f35784b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f35784b, 0));
                return;
        }
    }
}
