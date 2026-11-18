package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ic0 implements org.telegram.ui.ActionBar.r1 {
    public final int f48694a;
    public final pc0 f48695b;

    public ic0(pc0 pc0Var, int i7) {
        this.f48694a = i7;
        this.f48695b = pc0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f48694a;
        pc0 pc0Var = this.f48695b;
        switch (i10) {
            case 0:
                pc0Var.c(true);
                pc0Var.Q.M1(0, true, null, true);
                pc0Var.n();
                return;
            case 1:
                pc0Var.Q.f47202s0.popup = false;
                pc0Var.h(null);
                return;
            case 2:
                ee0 ee0Var = pc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131743963, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f28744a;
                u1Var2.S = M0;
                u1Var2.U = org.telegram.messenger.gd.M0(2131743740, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745125, "SignUp"), new ic0(pc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751593, "Decline"), new ic0(pc0Var, 4));
                ee0Var.showDialog(u1Var2);
                return;
            case 3:
                pc0Var.Q.f47202s0.popup = false;
                pc0Var.h(null);
                return;
            default:
                pc0Var.c(true);
                pc0Var.Q.M1(0, true, null, true);
                return;
        }
    }
}
