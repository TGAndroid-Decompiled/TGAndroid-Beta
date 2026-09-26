package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u80 implements Runnable {
    public final int f28738a;
    public final w80 f28739b;
    public final boolean f28740c;

    public u80(w80 w80Var, boolean z10, int i10) {
        this.f28738a = i10;
        this.f28739b = w80Var;
        this.f28740c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28738a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u80(this.f28739b, this.f28740c, 1));
                return;
            default:
                this.f28739b.setJoinRequest(this.f28740c);
                return;
        }
    }
}
