package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hc0 implements org.telegram.ui.ActionBar.q1 {
    public final int f48532a;
    public final oc0 f48533b;

    public hc0(oc0 oc0Var, int i7) {
        this.f48532a = i7;
        this.f48533b = oc0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f48532a;
        oc0 oc0Var = this.f48533b;
        switch (i10) {
            case 0:
                oc0Var.c(true);
                oc0Var.Q.M1(0, true, null, true);
                oc0Var.n();
                return;
            case 1:
                oc0Var.Q.f47074s0.popup = false;
                oc0Var.h(null);
                return;
            case 2:
                de0 de0Var = oc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743953, "TermsOfService");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28835a;
                t1Var2.S = N0;
                t1Var2.U = org.telegram.messenger.gd.N0(2131743730, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745124, "SignUp"), new hc0(oc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751592, "Decline"), new hc0(oc0Var, 4));
                de0Var.showDialog(t1Var2);
                return;
            case 3:
                oc0Var.Q.f47074s0.popup = false;
                oc0Var.h(null);
                return;
            default:
                oc0Var.c(true);
                oc0Var.Q.M1(0, true, null, true);
                return;
        }
    }
}
