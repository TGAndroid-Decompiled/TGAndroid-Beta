package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e90 implements Runnable {
    public final int f27769a;
    public final g90 f27770b;
    public final boolean f27771c;

    public e90(g90 g90Var, boolean z10, int i10) {
        this.f27769a = i10;
        this.f27770b = g90Var;
        this.f27771c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27769a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e90(this.f27770b, this.f27771c, 1));
                return;
            default:
                this.f27770b.setJoinRequest(this.f27771c);
                return;
        }
    }
}
