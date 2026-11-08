package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ic0 implements org.telegram.ui.ActionBar.r1 {
    public final int f46640a;
    public final pc0 f46641b;

    public ic0(pc0 pc0Var, int i7) {
        this.f46640a = i7;
        this.f46641b = pc0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f46640a;
        pc0 pc0Var = this.f46641b;
        switch (i10) {
            case 0:
                pc0Var.c(true);
                pc0Var.P.M1(0, true, null, true);
                pc0Var.n();
                return;
            case 1:
                pc0Var.P.f44782q0.popup = false;
                pc0Var.h(null);
                return;
            case 2:
                ce0 ce0Var = pc0Var.P;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744201, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27296a;
                u1Var2.R = M0;
                u1Var2.T = org.telegram.messenger.id.M0(2131743980, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745323, "SignUp"), new ic0(pc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751605, "Decline"), new ic0(pc0Var, 4));
                ce0Var.showDialog(u1Var2);
                return;
            case 3:
                pc0Var.P.f44782q0.popup = false;
                pc0Var.h(null);
                return;
            default:
                pc0Var.c(true);
                pc0Var.P.M1(0, true, null, true);
                return;
        }
    }
}
