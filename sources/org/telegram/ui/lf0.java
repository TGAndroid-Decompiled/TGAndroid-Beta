package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lf0 implements Runnable {
    public final int f38915a;
    public final v3 f38916b;

    public lf0(v3 v3Var, int i10) {
        this.f38915a = i10;
        this.f38916b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f38915a) {
            case 0:
                this.f38916b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new lf0(this.f38916b, 0));
                return;
        }
    }
}
