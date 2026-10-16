package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hg0 implements Runnable {
    public final int f36546a;
    public final v3 f36547b;

    public hg0(v3 v3Var, int i10) {
        this.f36546a = i10;
        this.f36547b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f36546a) {
            case 0:
                this.f36547b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new hg0(this.f36547b, 0));
                return;
        }
    }
}
