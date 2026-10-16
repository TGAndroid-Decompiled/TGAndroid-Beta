package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j90 implements Runnable {
    public final int f25938a;
    public final l90 f25939b;
    public final boolean f25940c;
    public final boolean d;

    public j90(l90 l90Var, boolean z10, boolean z11, int i10) {
        this.f25938a = i10;
        this.f25939b = l90Var;
        this.f25940c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25938a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j90(this.f25939b, this.f25940c, this.d, 1));
                return;
            default:
                l90 l90Var = this.f25939b;
                l90Var.setJoinRequest(this.f25940c);
                l90Var.setJoinToSend(this.d);
                return;
        }
    }
}
