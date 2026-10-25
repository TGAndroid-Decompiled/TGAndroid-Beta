package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e90 implements Runnable {
    public final int f27767a;
    public final g90 f27768b;
    public final boolean f27769c;

    public e90(g90 g90Var, boolean z10, int i10) {
        this.f27767a = i10;
        this.f27768b = g90Var;
        this.f27769c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27767a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e90(this.f27768b, this.f27769c, 1));
                return;
            default:
                this.f27768b.setJoinRequest(this.f27769c);
                return;
        }
    }
}
