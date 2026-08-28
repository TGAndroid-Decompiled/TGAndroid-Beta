package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nf0 implements Runnable {
    public final int f40717a;
    public final w3 f40718b;

    public nf0(w3 w3Var, int i9) {
        this.f40717a = i9;
        this.f40718b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f40717a) {
            case 0:
                this.f40718b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new nf0(this.f40718b, 0));
                return;
        }
    }
}
