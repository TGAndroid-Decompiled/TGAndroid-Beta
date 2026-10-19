package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kf0 implements Runnable {
    public final int f38587a;
    public final v3 f38588b;

    public kf0(v3 v3Var, int i10) {
        this.f38587a = i10;
        this.f38588b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f38587a) {
            case 0:
                this.f38588b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new kf0(this.f38588b, 0));
                return;
        }
    }
}
