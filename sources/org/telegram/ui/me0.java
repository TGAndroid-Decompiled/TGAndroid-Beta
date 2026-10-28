package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class me0 implements org.telegram.ui.ActionBar.b2 {
    public final int f41424a;
    public final te0 f41425b;

    public me0(te0 te0Var, int i10) {
        this.f41424a = i10;
        this.f41425b = te0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f41424a) {
            case 0:
                te0 te0Var = this.f41425b;
                te0Var.c(true);
                te0Var.O.z1(0, true, null, true);
                te0Var.n();
                return;
            case 1:
                te0 te0Var2 = this.f41425b;
                te0Var2.O.f40160q0.popup = false;
                te0Var2.h(null);
                return;
            case 2:
                te0 te0Var3 = this.f41425b;
                ig0 ig0Var = te0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f22369a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new me0(te0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new me0(te0Var3, 4));
                ig0Var.showDialog(alertDialog$Builder.f22369a);
                return;
            case 3:
                te0 te0Var4 = this.f41425b;
                te0Var4.O.f40160q0.popup = false;
                te0Var4.h(null);
                return;
            default:
                te0 te0Var5 = this.f41425b;
                te0Var5.c(true);
                te0Var5.O.z1(0, true, null, true);
                return;
        }
    }
}
