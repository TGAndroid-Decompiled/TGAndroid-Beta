package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class po implements Runnable {
    public final int f36661a;
    public final long f36662b;
    public final long f36663c;
    public final org.telegram.ui.ActionBar.n2 d;

    public po(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f36661a = i10;
        this.d = n2Var;
        this.f36662b = j3;
        this.f36663c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.k61 k61Var;
        switch (this.f36661a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36662b, this.f36663c, new b5((uo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.f36662b;
                a2Var.f38825n = this.f36663c;
                org.telegram.ui.Components.m61 m61Var = a2Var.f26598a;
                if (m61Var != null && (k61Var = m61Var.Y2) != null && m61Var.G) {
                    k61Var.N(true);
                    return;
                }
                return;
        }
    }
}
