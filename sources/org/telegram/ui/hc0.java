package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f48329a;
    public final oc0 f48330b;

    public hc0(oc0 oc0Var, int i7) {
        this.f48329a = i7;
        this.f48330b = oc0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f48329a;
        oc0 oc0Var = this.f48330b;
        switch (i10) {
            case 0:
                oc0Var.c(true);
                oc0Var.Q.M1(0, true, null, true);
                oc0Var.n();
                return;
            case 1:
                oc0Var.Q.f46958s0.popup = false;
                oc0Var.h(null);
                return;
            case 2:
                de0 de0Var = oc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131743963, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f28746a;
                u1Var2.S = M0;
                u1Var2.U = org.telegram.messenger.gd.M0(2131743740, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745125, "SignUp"), new hc0(oc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751593, "Decline"), new hc0(oc0Var, 4));
                de0Var.showDialog(u1Var2);
                return;
            case 3:
                oc0Var.Q.f46958s0.popup = false;
                oc0Var.h(null);
                return;
            default:
                oc0Var.c(true);
                oc0Var.Q.M1(0, true, null, true);
                return;
        }
    }
}
