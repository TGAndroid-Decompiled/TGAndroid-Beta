package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class he0 implements org.telegram.ui.ActionBar.a2 {
    public final int f37578a;
    public final ne0 f37579b;

    public he0(ne0 ne0Var, int i10) {
        this.f37578a = i10;
        this.f37579b = ne0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37578a) {
            case 0:
                ne0 ne0Var = this.f37579b;
                ne0Var.c(true);
                ne0Var.O.u1(0, true, null, true);
                ne0Var.o();
                return;
            case 1:
                ne0 ne0Var2 = this.f37579b;
                ne0Var2.O.f36379p0.popup = false;
                ne0Var2.h(null);
                return;
            case 2:
                ne0 ne0Var3 = this.f37579b;
                dg0 dg0Var = ne0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getParentActivity());
                alertDialog$Builder.f20602a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f20602a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new he0(ne0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new he0(ne0Var3, 4));
                dg0Var.showDialog(alertDialog$Builder.f20602a);
                return;
            case 3:
                ne0 ne0Var4 = this.f37579b;
                ne0Var4.O.f36379p0.popup = false;
                ne0Var4.h(null);
                return;
            default:
                ne0 ne0Var5 = this.f37579b;
                ne0Var5.c(true);
                ne0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
