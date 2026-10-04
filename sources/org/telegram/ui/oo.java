package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class oo implements Runnable {
    public final int f39247a;
    public final long f39248b;
    public final long f39249c;
    public final org.telegram.ui.ActionBar.n2 d;

    public oo(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f39247a = i10;
        this.d = n2Var;
        this.f39248b = j3;
        this.f39249c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.u61 u61Var;
        switch (this.f39247a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f39248b, this.f39249c, new c5((to) this.d, 4));
                return;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.f39248b;
                a2Var.f42098n = this.f39249c;
                org.telegram.ui.Components.w61 w61Var = a2Var.f32724a;
                if (w61Var != null && (u61Var = w61Var.f25244f3) != null && w61Var.G) {
                    u61Var.N(true);
                    return;
                }
                return;
        }
    }
}
