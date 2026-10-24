package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class me0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39574a;
    public final te0 f39575b;

    public me0(te0 te0Var, int i10) {
        this.f39574a = i10;
        this.f39575b = te0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39574a) {
            case 0:
                te0 te0Var = this.f39575b;
                te0Var.c(true);
                te0Var.O.y1(0, true, null, true);
                te0Var.n();
                return;
            case 1:
                te0 te0Var2 = this.f39575b;
                te0Var2.O.f37852p0.popup = false;
                te0Var2.h(null);
                return;
            case 2:
                te0 te0Var3 = this.f39575b;
                hg0 hg0Var = te0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hg0Var.getParentActivity());
                alertDialog$Builder.f20679a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f20679a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new me0(te0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new me0(te0Var3, 4));
                hg0Var.showDialog(alertDialog$Builder.f20679a);
                return;
            case 3:
                te0 te0Var4 = this.f39575b;
                te0Var4.O.f37852p0.popup = false;
                te0Var4.h(null);
                return;
            default:
                te0 te0Var5 = this.f39575b;
                te0Var5.c(true);
                te0Var5.O.y1(0, true, null, true);
                return;
        }
    }
}
