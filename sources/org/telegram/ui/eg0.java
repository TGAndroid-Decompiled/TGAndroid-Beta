package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class eg0 implements Runnable {
    public final int f37093a;
    public final t3 f37094b;

    public eg0(t3 t3Var, int i10) {
        this.f37093a = i10;
        this.f37094b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f37093a) {
            case 0:
                this.f37094b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new eg0(this.f37094b, 0));
                return;
        }
    }
}
