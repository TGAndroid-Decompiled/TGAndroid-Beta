package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nf0 implements Runnable {
    public final int f40792a;
    public final x3 f40793b;

    public nf0(x3 x3Var, int i10) {
        this.f40792a = i10;
        this.f40793b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f40792a) {
            case 0:
                this.f40793b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new nf0(this.f40793b, 0));
                return;
        }
    }
}
