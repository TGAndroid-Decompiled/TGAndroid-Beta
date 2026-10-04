package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class oo implements Runnable {
    public final int f39253a;
    public final long f39254b;
    public final long f39255c;
    public final org.telegram.ui.ActionBar.n2 d;

    public oo(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f39253a = i10;
        this.d = n2Var;
        this.f39254b = j3;
        this.f39255c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.u61 u61Var;
        switch (this.f39253a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f39254b, this.f39255c, new c5((to) this.d, 4));
                return;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.f39254b;
                a2Var.f42106n = this.f39255c;
                org.telegram.ui.Components.w61 w61Var = a2Var.f32731a;
                if (w61Var != null && (u61Var = w61Var.f25250f3) != null && w61Var.G) {
                    u61Var.N(true);
                    return;
                }
                return;
        }
    }
}
