package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ig0 implements Runnable {
    public final int f37115a;
    public final v3 f37116b;

    public ig0(v3 v3Var, int i10) {
        this.f37115a = i10;
        this.f37116b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f37115a) {
            case 0:
                this.f37116b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new ig0(this.f37116b, 0));
                return;
        }
    }
}
