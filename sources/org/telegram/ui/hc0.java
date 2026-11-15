package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hc0 implements org.telegram.ui.ActionBar.q1 {
    public final int f47660a;
    public final oc0 f47661b;

    public hc0(oc0 oc0Var, int i7) {
        this.f47660a = i7;
        this.f47661b = oc0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f47660a;
        oc0 oc0Var = this.f47661b;
        switch (i10) {
            case 0:
                oc0Var.c(true);
                oc0Var.Q.M1(0, true, null, true);
                oc0Var.n();
                return;
            case 1:
                oc0Var.Q.f46099s0.popup = false;
                oc0Var.h(null);
                return;
            case 2:
                ce0 ce0Var = oc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131744198, "TermsOfService");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28392a;
                t1Var2.S = M0;
                t1Var2.U = org.telegram.messenger.hd.M0(2131743977, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745320, "SignUp"), new hc0(oc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751604, "Decline"), new hc0(oc0Var, 4));
                ce0Var.showDialog(t1Var2);
                return;
            case 3:
                oc0Var.Q.f46099s0.popup = false;
                oc0Var.h(null);
                return;
            default:
                oc0Var.c(true);
                oc0Var.Q.M1(0, true, null, true);
                return;
        }
    }
}
