package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ke0 implements org.telegram.ui.ActionBar.b2 {
    public final int f40921a;
    public final re0 f40922b;

    public ke0(re0 re0Var, int i10) {
        this.f40921a = i10;
        this.f40922b = re0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40921a) {
            case 0:
                re0 re0Var = this.f40922b;
                re0Var.c(true);
                re0Var.O.z1(0, true, null, true);
                re0Var.n();
                return;
            case 1:
                re0 re0Var2 = this.f40922b;
                re0Var2.O.f39667p0.popup = false;
                re0Var2.h(null);
                return;
            case 2:
                re0 re0Var3 = this.f40922b;
                gg0 gg0Var = re0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var.getParentActivity());
                alertDialog$Builder.f22366a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f22366a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ke0(re0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ke0(re0Var3, 4));
                gg0Var.showDialog(alertDialog$Builder.f22366a);
                return;
            case 3:
                re0 re0Var4 = this.f40922b;
                re0Var4.O.f39667p0.popup = false;
                re0Var4.h(null);
                return;
            default:
                re0 re0Var5 = this.f40922b;
                re0Var5.c(true);
                re0Var5.O.z1(0, true, null, true);
                return;
        }
    }
}
