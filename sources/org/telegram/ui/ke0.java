package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ke0 implements org.telegram.ui.ActionBar.b2 {
    public final int f39821a;
    public final qe0 f39822b;

    public ke0(qe0 qe0Var, int i9) {
        this.f39821a = i9;
        this.f39822b = qe0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f39821a) {
            case 0:
                qe0 qe0Var = this.f39822b;
                qe0Var.c(true);
                qe0Var.K.u1(0, true, null, true);
                qe0Var.o();
                return;
            case 1:
                qe0 qe0Var2 = this.f39822b;
                qe0Var2.K.f38275l0.popup = false;
                qe0Var2.h(null);
                return;
            case 2:
                qe0 qe0Var3 = this.f39822b;
                fg0 fg0Var = qe0Var3.K;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f22702a.P = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ke0(qe0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ke0(qe0Var3, 4));
                fg0Var.showDialog(alertDialog$Builder.f22702a);
                return;
            case 3:
                qe0 qe0Var4 = this.f39822b;
                qe0Var4.K.f38275l0.popup = false;
                qe0Var4.h(null);
                return;
            default:
                qe0 qe0Var5 = this.f39822b;
                qe0Var5.c(true);
                qe0Var5.K.u1(0, true, null, true);
                return;
        }
    }
}
