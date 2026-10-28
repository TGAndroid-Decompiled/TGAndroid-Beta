package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g90 implements Runnable {
    public final int f28483a;
    public final h90 f28484b;
    public final boolean f28485c;
    public final boolean d;

    public g90(h90 h90Var, boolean z10, boolean z11, int i10) {
        this.f28483a = i10;
        this.f28484b = h90Var;
        this.f28485c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28483a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g90(this.f28484b, this.f28485c, this.d, 1));
                return;
            default:
                h90 h90Var = this.f28484b;
                h90Var.setJoinRequest(this.f28485c);
                h90Var.setJoinToSend(this.d);
                return;
        }
    }
}
