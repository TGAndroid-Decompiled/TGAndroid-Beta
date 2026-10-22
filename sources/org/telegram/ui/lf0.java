package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lf0 implements Runnable {
    public final int f38914a;
    public final v3 f38915b;

    public lf0(v3 v3Var, int i10) {
        this.f38914a = i10;
        this.f38915b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f38914a) {
            case 0:
                this.f38915b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new lf0(this.f38915b, 0));
                return;
        }
    }
}
