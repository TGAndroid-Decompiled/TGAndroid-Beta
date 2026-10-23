package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qf0 implements Runnable {
    public final int f40798a;
    public final u3 f40799b;

    public qf0(u3 u3Var, int i10) {
        this.f40798a = i10;
        this.f40799b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f40798a) {
            case 0:
                this.f40799b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new qf0(this.f40799b, 0));
                return;
        }
    }
}
