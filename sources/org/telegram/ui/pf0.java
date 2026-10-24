package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pf0 implements Runnable {
    public final int f40529a;
    public final u3 f40530b;

    public pf0(u3 u3Var, int i10) {
        this.f40529a = i10;
        this.f40530b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f40529a) {
            case 0:
                this.f40530b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new pf0(this.f40530b, 0));
                return;
        }
    }
}
