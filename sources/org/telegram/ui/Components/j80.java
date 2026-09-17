package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j80 implements Runnable {
    public final int f27405a;
    public final k80 f27406b;
    public final boolean f27407c;
    public final boolean d;

    public j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.f27405a = i10;
        this.f27406b = k80Var;
        this.f27407c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f27405a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.f27406b, this.f27407c, this.d, 1));
                return;
            default:
                k80 k80Var = this.f27406b;
                k80Var.setJoinRequest(this.f27407c);
                k80Var.setJoinToSend(this.d);
                return;
        }
    }
}
