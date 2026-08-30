package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class mo implements Runnable {
    public final int f36361a;
    public final long f36362b;
    public final long f36363c;
    public final org.telegram.ui.ActionBar.p2 d;

    public mo(org.telegram.ui.ActionBar.p2 p2Var, long j10, long j11, int i10) {
        this.f36361a = i10;
        this.d = p2Var;
        this.f36362b = j10;
        this.f36363c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.w51 w51Var;
        switch (this.f36361a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36362b, this.f36363c, new d5((po) this.d, 4));
                return;
            default:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.d;
                x1Var.f39702f = this.f36362b;
                x1Var.h = this.f36363c;
                org.telegram.ui.Components.a61 a61Var = x1Var.f23580a;
                if (a61Var != null && (w51Var = a61Var.V2) != null && a61Var.D) {
                    w51Var.N(true);
                    return;
                }
                return;
        }
    }
}
