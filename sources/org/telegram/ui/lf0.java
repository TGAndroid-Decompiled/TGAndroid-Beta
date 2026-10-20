package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lf0 implements Runnable {
    public final int f38910a;
    public final v3 f38911b;

    public lf0(v3 v3Var, int i10) {
        this.f38910a = i10;
        this.f38911b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f38910a) {
            case 0:
                this.f38911b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new lf0(this.f38911b, 0));
                return;
        }
    }
}
