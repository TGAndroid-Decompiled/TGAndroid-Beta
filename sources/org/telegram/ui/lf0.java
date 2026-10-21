package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lf0 implements Runnable {
    public final int f38911a;
    public final v3 f38912b;

    public lf0(v3 v3Var, int i10) {
        this.f38911a = i10;
        this.f38912b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f38911a) {
            case 0:
                this.f38912b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new lf0(this.f38912b, 0));
                return;
        }
    }
}
