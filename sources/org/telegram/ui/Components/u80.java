package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u80 implements Runnable {
    public final int f28758a;
    public final v80 f28759b;
    public final boolean f28760c;
    public final boolean d;

    public u80(v80 v80Var, boolean z10, boolean z11, int i10) {
        this.f28758a = i10;
        this.f28759b = v80Var;
        this.f28760c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28758a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u80(this.f28759b, this.f28760c, this.d, 1));
                return;
            default:
                v80 v80Var = this.f28759b;
                v80Var.setJoinRequest(this.f28760c);
                v80Var.setJoinToSend(this.d);
                return;
        }
    }
}
