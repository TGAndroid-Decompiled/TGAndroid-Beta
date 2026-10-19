package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d90 implements Runnable {
    public final int f25497a;
    public final e90 f25498b;
    public final boolean f25499c;
    public final boolean d;

    public d90(e90 e90Var, boolean z10, boolean z11, int i10) {
        this.f25497a = i10;
        this.f25498b = e90Var;
        this.f25499c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25497a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d90(this.f25498b, this.f25499c, this.d, 1));
                return;
            default:
                e90 e90Var = this.f25498b;
                e90Var.setJoinRequest(this.f25499c);
                e90Var.setJoinToSend(this.d);
                return;
        }
    }
}
