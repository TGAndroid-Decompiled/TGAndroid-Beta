package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nf0 implements Runnable {
    public final int f39465a;
    public final v3 f39466b;

    public nf0(v3 v3Var, int i10) {
        this.f39465a = i10;
        this.f39466b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f39465a) {
            case 0:
                this.f39466b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new nf0(this.f39466b, 0));
                return;
        }
    }
}
