package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f33016a;
    public final s3 f33017b;

    public dg0(s3 s3Var, int i10) {
        this.f33016a = i10;
        this.f33017b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f33016a) {
            case 0:
                this.f33017b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f33017b, 0));
                return;
        }
    }
}
