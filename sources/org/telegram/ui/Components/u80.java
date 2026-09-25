package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u80 implements Runnable {
    public final int f28759a;
    public final v80 f28760b;
    public final boolean f28761c;
    public final boolean d;

    public u80(v80 v80Var, boolean z10, boolean z11, int i10) {
        this.f28759a = i10;
        this.f28760b = v80Var;
        this.f28761c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28759a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u80(this.f28760b, this.f28761c, this.d, 1));
                return;
            default:
                v80 v80Var = this.f28760b;
                v80Var.setJoinRequest(this.f28761c);
                v80Var.setJoinToSend(this.d);
                return;
        }
    }
}
