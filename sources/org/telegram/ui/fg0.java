package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fg0 implements Runnable {
    public final int f33633a;
    public final s3 f33634b;

    public fg0(s3 s3Var, int i10) {
        this.f33633a = i10;
        this.f33634b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f33633a) {
            case 0:
                this.f33634b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new fg0(this.f33634b, 0));
                return;
        }
    }
}
