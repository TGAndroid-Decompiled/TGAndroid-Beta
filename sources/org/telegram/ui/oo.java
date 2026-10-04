package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class oo implements Runnable {
    public final int f39248a;
    public final long f39249b;
    public final long f39250c;
    public final org.telegram.ui.ActionBar.n2 d;

    public oo(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f39248a = i10;
        this.d = n2Var;
        this.f39249b = j3;
        this.f39250c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.u61 u61Var;
        switch (this.f39248a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f39249b, this.f39250c, new c5((to) this.d, 4));
                return;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.f39249b;
                a2Var.f42099n = this.f39250c;
                org.telegram.ui.Components.w61 w61Var = a2Var.f32725a;
                if (w61Var != null && (u61Var = w61Var.f25245f3) != null && w61Var.G) {
                    u61Var.N(true);
                    return;
                }
                return;
        }
    }
}
