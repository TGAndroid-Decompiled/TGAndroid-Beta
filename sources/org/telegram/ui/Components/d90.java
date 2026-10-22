package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d90 implements Runnable {
    public final int f25390a;
    public final e90 f25391b;
    public final boolean f25392c;
    public final boolean d;

    public d90(e90 e90Var, boolean z10, boolean z11, int i10) {
        this.f25390a = i10;
        this.f25391b = e90Var;
        this.f25392c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25390a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d90(this.f25391b, this.f25392c, this.d, 1));
                return;
            default:
                e90 e90Var = this.f25391b;
                e90Var.setJoinRequest(this.f25392c);
                e90Var.setJoinToSend(this.d);
                return;
        }
    }
}
