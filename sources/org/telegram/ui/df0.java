package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class df0 implements org.telegram.ui.ActionBar.a2 {
    public final int f33027a;
    public final jf0 f33028b;

    public df0(jf0 jf0Var, int i10) {
        this.f33027a = i10;
        this.f33028b = jf0Var;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33027a) {
            case 0:
                jf0 jf0Var = this.f33028b;
                jf0Var.c(true);
                jf0Var.O.u1(0, true, null, true);
                jf0Var.o();
                return;
            case 1:
                jf0 jf0Var2 = this.f33028b;
                jf0Var2.O.f39928p0.popup = false;
                jf0Var2.h(null);
                return;
            case 2:
                jf0 jf0Var3 = this.f33028b;
                yg0 yg0Var = jf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
                alertDialog$Builder.f18654a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f18654a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new df0(jf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new df0(jf0Var3, 4));
                yg0Var.showDialog(alertDialog$Builder.f18654a);
                return;
            case 3:
                jf0 jf0Var4 = this.f33028b;
                jf0Var4.O.f39928p0.popup = false;
                jf0Var4.h(null);
                return;
            default:
                jf0 jf0Var5 = this.f33028b;
                jf0Var5.c(true);
                jf0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
