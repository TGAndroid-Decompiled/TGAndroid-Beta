package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lf0 implements Runnable {
    public final int f38904a;
    public final v3 f38905b;

    public lf0(v3 v3Var, int i10) {
        this.f38904a = i10;
        this.f38905b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f38904a) {
            case 0:
                this.f38905b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new lf0(this.f38905b, 0));
                return;
        }
    }
}
