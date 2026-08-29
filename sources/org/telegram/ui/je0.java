package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class je0 implements org.telegram.ui.ActionBar.b2 {
    public final int f39524a;
    public final pe0 f39525b;

    public je0(pe0 pe0Var, int i10) {
        this.f39524a = i10;
        this.f39525b = pe0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39524a) {
            case 0:
                pe0 pe0Var = this.f39525b;
                pe0Var.c(true);
                pe0Var.K.u1(0, true, null, true);
                pe0Var.o();
                return;
            case 1:
                pe0 pe0Var2 = this.f39525b;
                pe0Var2.K.f38167l0.popup = false;
                pe0Var2.h(null);
                return;
            case 2:
                pe0 pe0Var3 = this.f39525b;
                fg0 fg0Var = pe0Var3.K;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f22714a.P = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new je0(pe0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new je0(pe0Var3, 4));
                fg0Var.showDialog(alertDialog$Builder.f22714a);
                return;
            case 3:
                pe0 pe0Var4 = this.f39525b;
                pe0Var4.K.f38167l0.popup = false;
                pe0Var4.h(null);
                return;
            default:
                pe0 pe0Var5 = this.f39525b;
                pe0Var5.c(true);
                pe0Var5.K.u1(0, true, null, true);
                return;
        }
    }
}
