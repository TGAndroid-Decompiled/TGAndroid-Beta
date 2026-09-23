package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class k80 implements Runnable {
    public final int f25550a;
    public final l80 f25551b;
    public final boolean f25552c;
    public final boolean d;

    public k80(l80 l80Var, boolean z10, boolean z11, int i10) {
        this.f25550a = i10;
        this.f25551b = l80Var;
        this.f25552c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25550a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k80(this.f25551b, this.f25552c, this.d, 1));
                return;
            default:
                l80 l80Var = this.f25551b;
                l80Var.setJoinRequest(this.f25552c);
                l80Var.setJoinToSend(this.d);
                return;
        }
    }
}
