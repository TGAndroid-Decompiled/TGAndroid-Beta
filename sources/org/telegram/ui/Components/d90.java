package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d90 implements Runnable {
    public final int f25387a;
    public final e90 f25388b;
    public final boolean f25389c;
    public final boolean d;

    public d90(e90 e90Var, boolean z10, boolean z11, int i10) {
        this.f25387a = i10;
        this.f25388b = e90Var;
        this.f25389c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25387a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d90(this.f25388b, this.f25389c, this.d, 1));
                return;
            default:
                e90 e90Var = this.f25388b;
                e90Var.setJoinRequest(this.f25389c);
                e90Var.setJoinToSend(this.d);
                return;
        }
    }
}
