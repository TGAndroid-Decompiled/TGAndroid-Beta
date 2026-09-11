package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j80 implements Runnable {
    public final int f27377a;
    public final k80 f27378b;
    public final boolean f27379c;
    public final boolean d;

    public j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.f27377a = i10;
        this.f27378b = k80Var;
        this.f27379c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f27377a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.f27378b, this.f27379c, this.d, 1));
                return;
            default:
                k80 k80Var = this.f27378b;
                k80Var.setJoinRequest(this.f27379c);
                k80Var.setJoinToSend(this.d);
                return;
        }
    }
}
