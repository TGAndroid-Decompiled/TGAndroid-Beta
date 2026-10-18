package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mf0 implements Runnable {
    public final int f39156a;
    public final v3 f39157b;

    public mf0(v3 v3Var, int i10) {
        this.f39156a = i10;
        this.f39157b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f39156a) {
            case 0:
                this.f39157b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new mf0(this.f39157b, 0));
                return;
        }
    }
}
