package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class mo implements Runnable {
    public final int f39009a;
    public final long f39010b;
    public final long f39011c;
    public final org.telegram.ui.ActionBar.p2 d;

    public mo(org.telegram.ui.ActionBar.p2 p2Var, long j10, long j11, int i10) {
        this.f39009a = i10;
        this.d = p2Var;
        this.f39010b = j10;
        this.f39011c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.w51 w51Var;
        switch (this.f39009a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f39010b, this.f39011c, new d5((po) this.d, 4));
                return;
            default:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.d;
                x1Var.f42734f = this.f39010b;
                x1Var.h = this.f39011c;
                org.telegram.ui.Components.a61 a61Var = x1Var.f25523a;
                if (a61Var != null && (w51Var = a61Var.V2) != null && a61Var.D) {
                    w51Var.N(true);
                    return;
                }
                return;
        }
    }
}
