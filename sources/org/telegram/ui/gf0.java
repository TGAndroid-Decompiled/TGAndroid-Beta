package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gf0 implements org.telegram.ui.ActionBar.z1 {
    public final int f36386a;
    public final mf0 f36387b;

    public gf0(mf0 mf0Var, int i10) {
        this.f36386a = i10;
        this.f36387b = mf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36386a) {
            case 0:
                mf0 mf0Var = this.f36387b;
                mf0Var.c(true);
                mf0Var.O.u1(0, true, null, true);
                mf0Var.o();
                return;
            case 1:
                mf0 mf0Var2 = this.f36387b;
                mf0Var2.O.f34562p0.popup = false;
                mf0Var2.h(null);
                return;
            case 2:
                mf0 mf0Var3 = this.f36387b;
                bh0 bh0Var = mf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var.getParentActivity());
                alertDialog$Builder.f19548a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f19548a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new gf0(mf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new gf0(mf0Var3, 4));
                bh0Var.showDialog(alertDialog$Builder.f19548a);
                return;
            case 3:
                mf0 mf0Var4 = this.f36387b;
                mf0Var4.O.f34562p0.popup = false;
                mf0Var4.h(null);
                return;
            default:
                mf0 mf0Var5 = this.f36387b;
                mf0Var5.c(true);
                mf0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
