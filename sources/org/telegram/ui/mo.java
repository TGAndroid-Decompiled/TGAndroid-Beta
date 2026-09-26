package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class mo implements Runnable {
    public final int f35634a;
    public final long f35635b;
    public final long f35636c;
    public final org.telegram.ui.ActionBar.m2 d;

    public mo(org.telegram.ui.ActionBar.m2 m2Var, long j3, long j10, int i10) {
        this.f35634a = i10;
        this.d = m2Var;
        this.f35635b = j3;
        this.f35636c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.k61 k61Var;
        switch (this.f35634a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f35635b, this.f35636c, new b5((ro) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f39295f = this.f35635b;
                z1Var.h = this.f35636c;
                org.telegram.ui.Components.m61 m61Var = z1Var.f26682a;
                if (m61Var != null && (k61Var = m61Var.Y2) != null && m61Var.G) {
                    k61Var.N(true);
                    return;
                }
                return;
        }
    }
}
