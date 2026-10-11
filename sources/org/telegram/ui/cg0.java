package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cg0 implements Runnable {
    public final int f36695a;
    public final s3 f36696b;

    public cg0(s3 s3Var, int i10) {
        this.f36695a = i10;
        this.f36696b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f36695a) {
            case 0:
                this.f36696b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new cg0(this.f36696b, 0));
                return;
        }
    }
}
