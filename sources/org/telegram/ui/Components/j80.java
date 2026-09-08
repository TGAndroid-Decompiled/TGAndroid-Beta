package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j80 implements Runnable {
    public final int f27404a;
    public final k80 f27405b;
    public final boolean f27406c;
    public final boolean d;

    public j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.f27404a = i10;
        this.f27405b = k80Var;
        this.f27406c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f27404a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.f27405b, this.f27406c, this.d, 1));
                return;
            default:
                k80 k80Var = this.f27405b;
                k80Var.setJoinRequest(this.f27406c);
                k80Var.setJoinToSend(this.d);
                return;
        }
    }
}
