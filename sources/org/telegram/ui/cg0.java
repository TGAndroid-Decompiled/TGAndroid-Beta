package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cg0 implements Runnable {
    public final int f36729a;
    public final s3 f36730b;

    public cg0(s3 s3Var, int i10) {
        this.f36729a = i10;
        this.f36730b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f36729a) {
            case 0:
                this.f36730b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new cg0(this.f36730b, 0));
                return;
        }
    }
}
