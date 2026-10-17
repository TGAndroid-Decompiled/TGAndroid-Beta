package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nf0 implements Runnable {
    public final int f39439a;
    public final v3 f39440b;

    public nf0(v3 v3Var, int i10) {
        this.f39439a = i10;
        this.f39440b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f39439a) {
            case 0:
                this.f39440b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new nf0(this.f39440b, 0));
                return;
        }
    }
}
