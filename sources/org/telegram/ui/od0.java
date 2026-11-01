package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class od0 implements org.telegram.ui.ActionBar.u1 {
    public final int f40137a;
    public final vd0 f40138b;

    public od0(vd0 vd0Var, int i10) {
        this.f40137a = i10;
        this.f40138b = vd0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.f40137a;
        vd0 vd0Var = this.f40138b;
        switch (i11) {
            case 0:
                vd0Var.c(true);
                vd0Var.O.D1(0, true, null, true);
                vd0Var.n();
                return;
            case 1:
                vd0Var.O.f37491q0.popup = false;
                vd0Var.h(null);
                return;
            case 2:
                gf0 gf0Var = vd0Var.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131744223, "TermsOfService");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
                x1Var2.R = L0;
                x1Var2.T = org.telegram.messenger.dd.L0(2131744002, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131745338, "SignUp"), new od0(vd0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751605, "Decline"), new od0(vd0Var, 4));
                gf0Var.showDialog(x1Var2);
                return;
            case 3:
                vd0Var.O.f37491q0.popup = false;
                vd0Var.h(null);
                return;
            default:
                vd0Var.c(true);
                vd0Var.O.D1(0, true, null, true);
                return;
        }
    }
}
