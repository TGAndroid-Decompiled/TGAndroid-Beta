package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r80 implements Runnable {
    public final int f27804a;
    public final s80 f27805b;
    public final boolean f27806c;
    public final boolean d;

    public r80(s80 s80Var, boolean z10, boolean z11, int i10) {
        this.f27804a = i10;
        this.f27805b = s80Var;
        this.f27806c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f27804a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r80(this.f27805b, this.f27806c, this.d, 1));
                return;
            default:
                s80 s80Var = this.f27805b;
                s80Var.setJoinRequest(this.f27806c);
                s80Var.setJoinToSend(this.d);
                return;
        }
    }
}
