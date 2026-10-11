package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l90 implements Runnable {
    public final int f28311a;
    public final m90 f28312b;
    public final boolean f28313c;
    public final boolean d;

    public l90(m90 m90Var, boolean z10, boolean z11, int i10) {
        this.f28311a = i10;
        this.f28312b = m90Var;
        this.f28313c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28311a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l90(this.f28312b, this.f28313c, this.d, 1));
                return;
            default:
                m90 m90Var = this.f28312b;
                m90Var.setJoinRequest(this.f28313c);
                m90Var.setJoinToSend(this.d);
                return;
        }
    }
}
