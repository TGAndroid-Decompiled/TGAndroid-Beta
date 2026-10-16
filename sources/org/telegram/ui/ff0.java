package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ff0 implements org.telegram.ui.ActionBar.z1 {
    public final int f35521a;
    public final lf0 f35522b;

    public ff0(lf0 lf0Var, int i10) {
        this.f35521a = i10;
        this.f35522b = lf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35521a) {
            case 0:
                lf0 lf0Var = this.f35522b;
                lf0Var.c(true);
                lf0Var.O.u1(0, true, null, true);
                lf0Var.o();
                return;
            case 1:
                lf0 lf0Var2 = this.f35522b;
                lf0Var2.O.f33924p0.popup = false;
                lf0Var2.h(null);
                return;
            case 2:
                lf0 lf0Var3 = this.f35522b;
                ah0 ah0Var = lf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
                alertDialog$Builder.f19248a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f19248a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ff0(lf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ff0(lf0Var3, 4));
                ah0Var.showDialog(alertDialog$Builder.f19248a);
                return;
            case 3:
                lf0 lf0Var4 = this.f35522b;
                lf0Var4.O.f33924p0.popup = false;
                lf0Var4.h(null);
                return;
            default:
                lf0 lf0Var5 = this.f35522b;
                lf0Var5.c(true);
                lf0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
