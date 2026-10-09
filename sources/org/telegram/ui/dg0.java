package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f36957a;
    public final t3 f36958b;

    public dg0(t3 t3Var, int i10) {
        this.f36957a = i10;
        this.f36958b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f36957a) {
            case 0:
                this.f36958b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f36958b, 0));
                return;
        }
    }
}
