package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j80 implements Runnable {
    public final int f25253a;
    public final k80 f25254b;
    public final boolean f25255c;
    public final boolean d;

    public j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.f25253a = i10;
        this.f25254b = k80Var;
        this.f25255c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25253a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.f25254b, this.f25255c, this.d, 1));
                return;
            default:
                k80 k80Var = this.f25254b;
                k80Var.setJoinRequest(this.f25255c);
                k80Var.setJoinToSend(this.d);
                return;
        }
    }
}
