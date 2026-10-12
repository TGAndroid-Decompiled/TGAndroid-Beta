package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o90 implements Runnable {
    public final int f29105a;
    public final q90 f29106b;
    public final boolean f29107c;

    public o90(q90 q90Var, boolean z10, int i10) {
        this.f29105a = i10;
        this.f29106b = q90Var;
        this.f29107c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29105a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o90(this.f29106b, this.f29107c, 1));
                return;
            default:
                this.f29106b.setJoinRequest(this.f29107c);
                return;
        }
    }
}
