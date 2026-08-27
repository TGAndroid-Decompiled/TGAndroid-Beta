package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class qf0 implements Runnable {

    public final int f41650a;

    public final x3 f41651b;

    public qf0(x3 x3Var, int i10) {
        this.f41650a = i10;
        this.f41651b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f41650a) {
            case 0:
                this.f41651b.run("CANCELLED");
                break;
            default:
                AndroidUtilities.runOnUIThread(new qf0(this.f41651b, 0));
                break;
        }
    }
}
