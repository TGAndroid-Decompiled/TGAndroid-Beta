package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bg0 implements Runnable {
    public final int f35088a;
    public final t3 f35089b;

    public bg0(t3 t3Var, int i10) {
        this.f35088a = i10;
        this.f35089b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f35088a) {
            case 0:
                this.f35089b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new bg0(this.f35089b, 0));
                return;
        }
    }
}
