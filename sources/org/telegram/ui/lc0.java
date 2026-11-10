package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f47581a;
    public final sc0 f47582b;

    public lc0(sc0 sc0Var, int i7) {
        this.f47581a = i7;
        this.f47582b = sc0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f47581a;
        sc0 sc0Var = this.f47582b;
        switch (i10) {
            case 0:
                sc0Var.c(true);
                sc0Var.P.M1(0, true, null, true);
                sc0Var.n();
                return;
            case 1:
                sc0Var.P.f45713q0.popup = false;
                sc0Var.h(null);
                return;
            case 2:
                fe0 fe0Var = sc0Var.P;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744198, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27300a;
                u1Var2.R = M0;
                u1Var2.T = org.telegram.messenger.id.M0(2131743977, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745320, "SignUp"), new lc0(sc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751604, "Decline"), new lc0(sc0Var, 4));
                fe0Var.showDialog(u1Var2);
                return;
            case 3:
                sc0Var.P.f45713q0.popup = false;
                sc0Var.h(null);
                return;
            default:
                sc0Var.c(true);
                sc0Var.P.M1(0, true, null, true);
                return;
        }
    }
}
