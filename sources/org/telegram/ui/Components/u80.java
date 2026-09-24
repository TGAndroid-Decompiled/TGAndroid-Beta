package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u80 implements Runnable {
    public final int f28745a;
    public final v80 f28746b;
    public final boolean f28747c;
    public final boolean d;

    public u80(v80 v80Var, boolean z10, boolean z11, int i10) {
        this.f28745a = i10;
        this.f28746b = v80Var;
        this.f28747c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28745a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u80(this.f28746b, this.f28747c, this.d, 1));
                return;
            default:
                v80 v80Var = this.f28746b;
                v80Var.setJoinRequest(this.f28747c);
                v80Var.setJoinToSend(this.d);
                return;
        }
    }
}
