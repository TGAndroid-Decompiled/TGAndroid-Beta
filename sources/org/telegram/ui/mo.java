package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class mo implements Runnable {
    public final int f35639a;
    public final long f35640b;
    public final long f35641c;
    public final org.telegram.ui.ActionBar.m2 d;

    public mo(org.telegram.ui.ActionBar.m2 m2Var, long j3, long j10, int i10) {
        this.f35639a = i10;
        this.d = m2Var;
        this.f35640b = j3;
        this.f35641c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.l61 l61Var;
        switch (this.f35639a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f35640b, this.f35641c, new b5((ro) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f39296f = this.f35640b;
                z1Var.h = this.f35641c;
                org.telegram.ui.Components.n61 n61Var = z1Var.f26972a;
                if (n61Var != null && (l61Var = n61Var.Y2) != null && n61Var.G) {
                    l61Var.N(true);
                    return;
                }
                return;
        }
    }
}
