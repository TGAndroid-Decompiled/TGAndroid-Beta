package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f47264a;
    public final rc0 f47265b;

    public kc0(rc0 rc0Var, int i7) {
        this.f47264a = i7;
        this.f47265b = rc0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f47264a;
        rc0 rc0Var = this.f47265b;
        switch (i10) {
            case 0:
                rc0Var.c(true);
                rc0Var.P.M1(0, true, null, true);
                rc0Var.n();
                return;
            case 1:
                rc0Var.P.f45389q0.popup = false;
                rc0Var.h(null);
                return;
            case 2:
                ee0 ee0Var = rc0Var.P;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744198, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27296a;
                u1Var2.R = M0;
                u1Var2.T = org.telegram.messenger.id.M0(2131743977, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745320, "SignUp"), new kc0(rc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751604, "Decline"), new kc0(rc0Var, 4));
                ee0Var.showDialog(u1Var2);
                return;
            case 3:
                rc0Var.P.f45389q0.popup = false;
                rc0Var.h(null);
                return;
            default:
                rc0Var.c(true);
                rc0Var.P.M1(0, true, null, true);
                return;
        }
    }
}
