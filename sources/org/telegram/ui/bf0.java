package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f34786a;
    public final hf0 f34787b;

    public bf0(hf0 hf0Var, int i10) {
        this.f34786a = i10;
        this.f34787b = hf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34786a) {
            case 0:
                hf0 hf0Var = this.f34787b;
                hf0Var.c(true);
                hf0Var.O.u1(0, true, null, true);
                hf0Var.o();
                return;
            case 1:
                hf0 hf0Var2 = this.f34787b;
                hf0Var2.O.f42379p0.popup = false;
                hf0Var2.h(null);
                return;
            case 2:
                hf0 hf0Var3 = this.f34787b;
                wg0 wg0Var = hf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                alertDialog$Builder.f20198a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f20198a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new bf0(hf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new bf0(hf0Var3, 4));
                wg0Var.showDialog(alertDialog$Builder.f20198a);
                return;
            case 3:
                hf0 hf0Var4 = this.f34787b;
                hf0Var4.O.f42379p0.popup = false;
                hf0Var4.h(null);
                return;
            default:
                hf0 hf0Var5 = this.f34787b;
                hf0Var5.c(true);
                hf0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
