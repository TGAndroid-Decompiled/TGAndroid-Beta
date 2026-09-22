package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u80 implements Runnable {
    public final int f28695a;
    public final v80 f28696b;
    public final boolean f28697c;
    public final boolean d;

    public u80(v80 v80Var, boolean z10, boolean z11, int i10) {
        this.f28695a = i10;
        this.f28696b = v80Var;
        this.f28697c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28695a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u80(this.f28696b, this.f28697c, this.d, 1));
                return;
            default:
                v80 v80Var = this.f28696b;
                v80Var.setJoinRequest(this.f28697c);
                v80Var.setJoinToSend(this.d);
                return;
        }
    }
}
