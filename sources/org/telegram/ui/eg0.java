package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class eg0 implements Runnable {
    public final int f33275a;
    public final s3 f33276b;

    public eg0(s3 s3Var, int i10) {
        this.f33275a = i10;
        this.f33276b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f33275a) {
            case 0:
                this.f33276b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new eg0(this.f33276b, 0));
                return;
        }
    }
}
