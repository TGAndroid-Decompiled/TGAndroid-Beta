package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p90 implements Runnable {
    public final int f29456a;
    public final q90 f29457b;
    public final boolean f29458c;
    public final boolean d;

    public p90(q90 q90Var, boolean z10, boolean z11, int i10) {
        this.f29456a = i10;
        this.f29457b = q90Var;
        this.f29458c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f29456a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p90(this.f29457b, this.f29458c, this.d, 1));
                return;
            default:
                q90 q90Var = this.f29457b;
                q90Var.setJoinRequest(this.f29458c);
                q90Var.setJoinToSend(this.d);
                return;
        }
    }
}
