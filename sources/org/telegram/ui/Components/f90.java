package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f90 implements Runnable {
    public final int f28102a;
    public final g90 f28103b;
    public final boolean f28104c;
    public final boolean d;

    public f90(g90 g90Var, boolean z10, boolean z11, int i10) {
        this.f28102a = i10;
        this.f28103b = g90Var;
        this.f28104c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28102a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f90(this.f28103b, this.f28104c, this.d, 1));
                return;
            default:
                g90 g90Var = this.f28103b;
                g90Var.setJoinRequest(this.f28104c);
                g90Var.setJoinToSend(this.d);
                return;
        }
    }
}
