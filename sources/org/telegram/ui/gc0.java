package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gc0 implements org.telegram.ui.ActionBar.p1 {
    public final int f45632a;
    public final nc0 f45633b;

    public gc0(nc0 nc0Var, int i3) {
        this.f45632a = i3;
        this.f45633b = nc0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.f45632a;
        nc0 nc0Var = this.f45633b;
        switch (i10) {
            case 0:
                nc0Var.c(true);
                nc0Var.P.D1(0, true, null, true);
                nc0Var.n();
                return;
            case 1:
                nc0Var.P.f51969r0.popup = false;
                nc0Var.h(null);
                return;
            case 2:
                xd0 xd0Var = nc0Var.P;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131744208, "TermsOfService");
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                s1Var2.S = M0;
                s1Var2.U = org.telegram.messenger.bd.M0(2131743987, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745330, "SignUp"), new gc0(nc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751605, "Decline"), new gc0(nc0Var, 4));
                xd0Var.showDialog(s1Var2);
                return;
            case 3:
                nc0Var.P.f51969r0.popup = false;
                nc0Var.h(null);
                return;
            default:
                nc0Var.c(true);
                nc0Var.P.D1(0, true, null, true);
                return;
        }
    }
}
