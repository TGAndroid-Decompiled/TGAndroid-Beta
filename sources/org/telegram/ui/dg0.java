package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dg0 implements Runnable {
    public final int f33009a;
    public final s3 f33010b;

    public dg0(s3 s3Var, int i10) {
        this.f33009a = i10;
        this.f33010b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f33009a) {
            case 0:
                this.f33010b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new dg0(this.f33010b, 0));
                return;
        }
    }
}
