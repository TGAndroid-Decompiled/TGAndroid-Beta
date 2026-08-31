package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class mo implements Runnable {
    public final int f39184a;
    public final long f39185b;
    public final long f39186c;
    public final org.telegram.ui.ActionBar.p2 d;

    public mo(org.telegram.ui.ActionBar.p2 p2Var, long j10, long j11, int i10) {
        this.f39184a = i10;
        this.d = p2Var;
        this.f39185b = j10;
        this.f39186c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.x51 x51Var;
        switch (this.f39184a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f39185b, this.f39186c, new d5((po) this.d, 4));
                return;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                y1Var.f42780f = this.f39185b;
                y1Var.h = this.f39186c;
                org.telegram.ui.Components.b61 b61Var = y1Var.f25815a;
                if (b61Var != null && (x51Var = b61Var.V2) != null && b61Var.D) {
                    x51Var.N(true);
                    return;
                }
                return;
        }
    }
}
