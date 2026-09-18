package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fg0 implements Runnable {
    public final int f33637a;
    public final s3 f33638b;

    public fg0(s3 s3Var, int i10) {
        this.f33637a = i10;
        this.f33638b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f33637a) {
            case 0:
                this.f33638b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new fg0(this.f33638b, 0));
                return;
        }
    }
}
