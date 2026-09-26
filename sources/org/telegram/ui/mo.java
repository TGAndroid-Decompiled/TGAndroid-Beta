package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class mo implements Runnable {
    public final int f35635a;
    public final long f35636b;
    public final long f35637c;
    public final org.telegram.ui.ActionBar.m2 d;

    public mo(org.telegram.ui.ActionBar.m2 m2Var, long j3, long j10, int i10) {
        this.f35635a = i10;
        this.d = m2Var;
        this.f35636b = j3;
        this.f35637c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.j61 j61Var;
        switch (this.f35635a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f35636b, this.f35637c, new b5((ro) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f39296f = this.f35636b;
                z1Var.h = this.f35637c;
                org.telegram.ui.Components.l61 l61Var = z1Var.f26371a;
                if (l61Var != null && (j61Var = l61Var.Y2) != null && l61Var.G) {
                    j61Var.N(true);
                    return;
                }
                return;
        }
    }
}
