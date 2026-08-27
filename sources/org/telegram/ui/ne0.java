package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ne0 implements org.telegram.ui.ActionBar.a2 {

    public final int f40811a;

    public final te0 f40812b;

    public ne0(te0 te0Var, int i10) {
        this.f40811a = i10;
        this.f40812b = te0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40811a) {
            case 0:
                te0 te0Var = this.f40812b;
                te0Var.c(true);
                te0Var.K.u1(0, true, null, true);
                te0Var.o();
                break;
            case 1:
                te0 te0Var2 = this.f40812b;
                te0Var2.K.f39095l0.popup = false;
                te0Var2.h(null);
                break;
            case 2:
                te0 te0Var3 = this.f40812b;
                ig0 ig0Var = te0Var3.K;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f22702a.P = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ne0(te0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ne0(te0Var3, 4));
                ig0Var.showDialog(alertDialog$Builder.f22702a);
                break;
            case 3:
                te0 te0Var4 = this.f40812b;
                te0Var4.K.f39095l0.popup = false;
                te0Var4.h(null);
                break;
            default:
                te0 te0Var5 = this.f40812b;
                te0Var5.c(true);
                te0Var5.K.u1(0, true, null, true);
                break;
        }
    }
}
