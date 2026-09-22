package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fg0 implements Runnable {
    public final int f33618a;
    public final s3 f33619b;

    public fg0(s3 s3Var, int i10) {
        this.f33618a = i10;
        this.f33619b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f33618a) {
            case 0:
                this.f33619b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new fg0(this.f33619b, 0));
                return;
        }
    }
}
