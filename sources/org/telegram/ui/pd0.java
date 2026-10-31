package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pd0 implements org.telegram.ui.ActionBar.u1 {
    public final int f40633a;
    public final wd0 f40634b;

    public pd0(wd0 wd0Var, int i10) {
        this.f40633a = i10;
        this.f40634b = wd0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.f40633a;
        wd0 wd0Var = this.f40634b;
        switch (i11) {
            case 0:
                wd0Var.c(true);
                wd0Var.O.C1(0, true, null, true);
                wd0Var.n();
                return;
            case 1:
                wd0Var.O.f37938q0.popup = false;
                wd0Var.h(null);
                return;
            case 2:
                hf0 hf0Var = wd0Var.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131744223, "TermsOfService");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20134a;
                x1Var2.R = L0;
                x1Var2.T = org.telegram.messenger.cd.L0(2131744002, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745338, "SignUp"), new pd0(wd0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751605, "Decline"), new pd0(wd0Var, 4));
                hf0Var.showDialog(x1Var2);
                return;
            case 3:
                wd0Var.O.f37938q0.popup = false;
                wd0Var.h(null);
                return;
            default:
                wd0Var.c(true);
                wd0Var.O.C1(0, true, null, true);
                return;
        }
    }
}
