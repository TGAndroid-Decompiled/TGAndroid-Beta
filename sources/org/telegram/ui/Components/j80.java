package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j80 implements Runnable {
    public final int f25175a;
    public final k80 f25176b;
    public final boolean f25177c;
    public final boolean d;

    public j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.f25175a = i10;
        this.f25176b = k80Var;
        this.f25177c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25175a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.f25176b, this.f25177c, this.d, 1));
                return;
            default:
                k80 k80Var = this.f25176b;
                k80Var.setJoinRequest(this.f25177c);
                k80Var.setJoinToSend(this.d);
                return;
        }
    }
}
