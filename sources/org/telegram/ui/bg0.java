package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bg0 implements Runnable {
    public final int f35082a;
    public final t3 f35083b;

    public bg0(t3 t3Var, int i10) {
        this.f35082a = i10;
        this.f35083b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f35082a) {
            case 0:
                this.f35083b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new bg0(this.f35083b, 0));
                return;
        }
    }
}
