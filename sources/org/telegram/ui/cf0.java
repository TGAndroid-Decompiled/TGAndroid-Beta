package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f32651a;
    public final if0 f32652b;

    public cf0(if0 if0Var, int i10) {
        this.f32651a = i10;
        this.f32652b = if0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32651a) {
            case 0:
                if0 if0Var = this.f32652b;
                if0Var.c(true);
                if0Var.O.u1(0, true, null, true);
                if0Var.o();
                return;
            case 1:
                if0 if0Var2 = this.f32652b;
                if0Var2.O.f39480p0.popup = false;
                if0Var2.h(null);
                return;
            case 2:
                if0 if0Var3 = this.f32652b;
                xg0 xg0Var = if0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
                alertDialog$Builder.f18622a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f18622a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new cf0(if0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new cf0(if0Var3, 4));
                xg0Var.showDialog(alertDialog$Builder.f18622a);
                return;
            case 3:
                if0 if0Var4 = this.f32652b;
                if0Var4.O.f39480p0.popup = false;
                if0Var4.h(null);
                return;
            default:
                if0 if0Var5 = this.f32652b;
                if0Var5.c(true);
                if0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
