package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f80 implements Runnable {
    public final int f28349a;
    public final g80 f28350b;
    public final boolean f28351c;
    public final boolean d;

    public f80(g80 g80Var, boolean z10, boolean z11, int i10) {
        this.f28349a = i10;
        this.f28350b = g80Var;
        this.f28351c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28349a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f80(this.f28350b, this.f28351c, this.d, 1));
                return;
            default:
                g80 g80Var = this.f28350b;
                g80Var.setJoinRequest(this.f28351c);
                g80Var.setJoinToSend(this.d);
                return;
        }
    }
}
