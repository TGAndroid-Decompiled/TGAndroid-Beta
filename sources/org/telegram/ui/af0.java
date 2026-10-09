package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class af0 implements org.telegram.ui.ActionBar.a2 {
    public final int f35917a;
    public final gf0 f35918b;

    public af0(gf0 gf0Var, int i10) {
        this.f35917a = i10;
        this.f35918b = gf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35917a) {
            case 0:
                gf0 gf0Var = this.f35918b;
                gf0Var.c(true);
                gf0Var.O.u1(0, true, null, true);
                gf0Var.o();
                return;
            case 1:
                gf0 gf0Var2 = this.f35918b;
                gf0Var2.O.f43594p0.popup = false;
                gf0Var2.h(null);
                return;
            case 2:
                gf0 gf0Var3 = this.f35918b;
                wg0 wg0Var = gf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                alertDialog$Builder.f20374a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f20374a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new af0(gf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new af0(gf0Var3, 4));
                wg0Var.showDialog(alertDialog$Builder.f20374a);
                return;
            case 3:
                gf0 gf0Var4 = this.f35918b;
                gf0Var4.O.f43594p0.popup = false;
                gf0Var4.h(null);
                return;
            default:
                gf0 gf0Var5 = this.f35918b;
                gf0Var5.c(true);
                gf0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
