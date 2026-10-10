package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class m90 implements Runnable {
    public final int f28727a;
    public final n90 f28728b;
    public final boolean f28729c;
    public final boolean d;

    public m90(n90 n90Var, boolean z10, boolean z11, int i10) {
        this.f28727a = i10;
        this.f28728b = n90Var;
        this.f28729c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28727a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m90(this.f28728b, this.f28729c, this.d, 1));
                return;
            default:
                n90 n90Var = this.f28728b;
                n90Var.setJoinRequest(this.f28729c);
                n90Var.setJoinToSend(this.d);
                return;
        }
    }
}
