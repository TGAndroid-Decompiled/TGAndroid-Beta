package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p90 implements Runnable {
    public final int f29453a;
    public final q90 f29454b;
    public final boolean f29455c;
    public final boolean d;

    public p90(q90 q90Var, boolean z10, boolean z11, int i10) {
        this.f29453a = i10;
        this.f29454b = q90Var;
        this.f29455c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f29453a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p90(this.f29454b, this.f29455c, this.d, 1));
                return;
            default:
                q90 q90Var = this.f29454b;
                q90Var.setJoinRequest(this.f29455c);
                q90Var.setJoinToSend(this.d);
                return;
        }
    }
}
