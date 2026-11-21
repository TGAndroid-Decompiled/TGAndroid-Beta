package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ic0 implements org.telegram.ui.ActionBar.q1 {
    public final int f48724a;
    public final pc0 f48725b;

    public ic0(pc0 pc0Var, int i7) {
        this.f48724a = i7;
        this.f48725b = pc0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f48724a;
        pc0 pc0Var = this.f48725b;
        switch (i10) {
            case 0:
                pc0Var.c(true);
                pc0Var.Q.M1(0, true, null, true);
                pc0Var.n();
                return;
            case 1:
                pc0Var.Q.f46948s0.popup = false;
                pc0Var.h(null);
                return;
            case 2:
                de0 de0Var = pc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743957, "TermsOfService");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28774a;
                t1Var2.S = N0;
                t1Var2.U = org.telegram.messenger.gd.N0(2131743734, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745124, "SignUp"), new ic0(pc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751592, "Decline"), new ic0(pc0Var, 4));
                de0Var.showDialog(t1Var2);
                return;
            case 3:
                pc0Var.Q.f46948s0.popup = false;
                pc0Var.h(null);
                return;
            default:
                pc0Var.c(true);
                pc0Var.Q.M1(0, true, null, true);
                return;
        }
    }
}
