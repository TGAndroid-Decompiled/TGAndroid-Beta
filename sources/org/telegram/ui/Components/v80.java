package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class v80 implements Runnable {
    public final int f29042a;
    public final w80 f29043b;
    public final boolean f29044c;
    public final boolean d;

    public v80(w80 w80Var, boolean z10, boolean z11, int i10) {
        this.f29042a = i10;
        this.f29043b = w80Var;
        this.f29044c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f29042a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v80(this.f29043b, this.f29044c, this.d, 1));
                return;
            default:
                w80 w80Var = this.f29043b;
                w80Var.setJoinRequest(this.f29044c);
                w80Var.setJoinToSend(this.d);
                return;
        }
    }
}
