package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t80 implements Runnable {
    public final int f27381a;
    public final u80 f27382b;
    public final boolean f27383c;
    public final boolean d;

    public t80(u80 u80Var, boolean z10, boolean z11, int i10) {
        this.f27381a = i10;
        this.f27382b = u80Var;
        this.f27383c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f27381a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t80(this.f27382b, this.f27383c, this.d, 1));
                return;
            default:
                u80 u80Var = this.f27382b;
                u80Var.setJoinRequest(this.f27383c);
                u80Var.setJoinToSend(this.d);
                return;
        }
    }
}
