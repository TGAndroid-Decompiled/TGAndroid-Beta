package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fg0 implements Runnable {
    public final int f33593a;
    public final s3 f33594b;

    public fg0(s3 s3Var, int i10) {
        this.f33593a = i10;
        this.f33594b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f33593a) {
            case 0:
                this.f33594b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new fg0(this.f33594b, 0));
                return;
        }
    }
}
