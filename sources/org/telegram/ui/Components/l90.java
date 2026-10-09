package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l90 implements Runnable {
    public final int f28391a;
    public final m90 f28392b;
    public final boolean f28393c;
    public final boolean d;

    public l90(m90 m90Var, boolean z10, boolean z11, int i10) {
        this.f28391a = i10;
        this.f28392b = m90Var;
        this.f28393c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28391a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l90(this.f28392b, this.f28393c, this.d, 1));
                return;
            default:
                m90 m90Var = this.f28392b;
                m90Var.setJoinRequest(this.f28393c);
                m90Var.setJoinToSend(this.d);
                return;
        }
    }
}
