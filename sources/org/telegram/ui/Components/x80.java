package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class x80 implements Runnable {
    public final int f30175a;
    public final y80 f30176b;
    public final boolean f30177c;
    public final boolean d;

    public x80(y80 y80Var, boolean z10, boolean z11, int i10) {
        this.f30175a = i10;
        this.f30176b = y80Var;
        this.f30177c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f30175a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x80(this.f30176b, this.f30177c, this.d, 1));
                return;
            default:
                y80 y80Var = this.f30176b;
                y80Var.setJoinRequest(this.f30177c);
                y80Var.setJoinToSend(this.d);
                return;
        }
    }
}
