package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j90 implements Runnable {
    public final int f26269a;
    public final l90 f26270b;
    public final boolean f26271c;
    public final boolean d;

    public j90(l90 l90Var, boolean z10, boolean z11, int i10) {
        this.f26269a = i10;
        this.f26270b = l90Var;
        this.f26271c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f26269a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j90(this.f26270b, this.f26271c, this.d, 1));
                return;
            default:
                l90 l90Var = this.f26270b;
                l90Var.setJoinRequest(this.f26271c);
                l90Var.setJoinToSend(this.d);
                return;
        }
    }
}
