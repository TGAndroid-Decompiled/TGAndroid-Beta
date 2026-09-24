package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class mo implements Runnable {
    public final int f35623a;
    public final long f35624b;
    public final long f35625c;
    public final org.telegram.ui.ActionBar.m2 d;

    public mo(org.telegram.ui.ActionBar.m2 m2Var, long j3, long j10, int i10) {
        this.f35623a = i10;
        this.d = m2Var;
        this.f35624b = j3;
        this.f35625c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.j61 j61Var;
        switch (this.f35623a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f35624b, this.f35625c, new b5((ro) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f39281f = this.f35624b;
                z1Var.h = this.f35625c;
                org.telegram.ui.Components.l61 l61Var = z1Var.f26364a;
                if (l61Var != null && (j61Var = l61Var.Y2) != null && l61Var.G) {
                    j61Var.N(true);
                    return;
                }
                return;
        }
    }
}
