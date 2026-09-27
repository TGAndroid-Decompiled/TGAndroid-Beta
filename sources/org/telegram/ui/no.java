package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class no implements Runnable {
    public final int f36062a;
    public final long f36063b;
    public final long f36064c;
    public final org.telegram.ui.ActionBar.o2 d;

    public no(org.telegram.ui.ActionBar.o2 o2Var, long j3, long j10, int i10) {
        this.f36062a = i10;
        this.d = o2Var;
        this.f36063b = j3;
        this.f36064c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.l61 l61Var;
        switch (this.f36062a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36063b, this.f36064c, new d5((so) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.h = this.f36063b;
                z1Var.f39252n = this.f36064c;
                org.telegram.ui.Components.n61 n61Var = z1Var.f27008a;
                if (n61Var != null && (l61Var = n61Var.Y2) != null && n61Var.G) {
                    l61Var.N(true);
                    return;
                }
                return;
        }
    }
}
