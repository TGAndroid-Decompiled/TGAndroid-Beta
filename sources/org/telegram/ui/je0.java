package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class je0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38126a;
    public final pe0 f38127b;

    public je0(pe0 pe0Var, int i10) {
        this.f38126a = i10;
        this.f38127b = pe0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38126a) {
            case 0:
                pe0 pe0Var = this.f38127b;
                pe0Var.c(true);
                pe0Var.O.u1(0, true, null, true);
                pe0Var.o();
                return;
            case 1:
                pe0 pe0Var2 = this.f38127b;
                pe0Var2.O.f36922p0.popup = false;
                pe0Var2.h(null);
                return;
            case 2:
                pe0 pe0Var3 = this.f38127b;
                fg0 fg0Var = pe0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.f20601a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f20601a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new je0(pe0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new je0(pe0Var3, 4));
                fg0Var.showDialog(alertDialog$Builder.f20601a);
                return;
            case 3:
                pe0 pe0Var4 = this.f38127b;
                pe0Var4.O.f36922p0.popup = false;
                pe0Var4.h(null);
                return;
            default:
                pe0 pe0Var5 = this.f38127b;
                pe0Var5.c(true);
                pe0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
