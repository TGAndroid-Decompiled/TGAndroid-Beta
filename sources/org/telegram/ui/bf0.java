package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bf0 implements org.telegram.ui.ActionBar.c2 {
    public final int f31251a;
    public final hf0 f31252b;

    public bf0(hf0 hf0Var, int i10) {
        this.f31251a = i10;
        this.f31252b = hf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f31251a) {
            case 0:
                hf0 hf0Var = this.f31252b;
                hf0Var.c(true);
                hf0Var.O.u1(0, true, null, true);
                hf0Var.o();
                return;
            case 1:
                hf0 hf0Var2 = this.f31252b;
                hf0Var2.O.f38736p0.popup = false;
                hf0Var2.h(null);
                return;
            case 2:
                hf0 hf0Var3 = this.f31252b;
                xg0 xg0Var = hf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f17528a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new bf0(hf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new bf0(hf0Var3, 4));
                xg0Var.showDialog(alertDialog$Builder.f17528a);
                return;
            case 3:
                hf0 hf0Var4 = this.f31252b;
                hf0Var4.O.f38736p0.popup = false;
                hf0Var4.h(null);
                return;
            default:
                hf0 hf0Var5 = this.f31252b;
                hf0Var5.c(true);
                hf0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
