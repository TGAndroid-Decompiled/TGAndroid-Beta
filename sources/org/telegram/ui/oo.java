package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class oo implements Runnable {
    public final int f39263a;
    public final long f39264b;
    public final long f39265c;
    public final org.telegram.ui.ActionBar.n2 d;

    public oo(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f39263a = i10;
        this.d = n2Var;
        this.f39264b = j3;
        this.f39265c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.w61 w61Var;
        switch (this.f39263a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f39264b, this.f39265c, new c5((to) this.d, 4));
                return;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.f39264b;
                a2Var.f42118n = this.f39265c;
                org.telegram.ui.Components.y61 y61Var = a2Var.f33438a;
                if (y61Var != null && (w61Var = y61Var.f26034f3) != null && y61Var.G) {
                    w61Var.N(true);
                    return;
                }
                return;
        }
    }
}
