package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ne0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39856a;
    public final ue0 f39857b;

    public ne0(ue0 ue0Var, int i10) {
        this.f39856a = i10;
        this.f39857b = ue0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39856a) {
            case 0:
                ue0 ue0Var = this.f39857b;
                ue0Var.c(true);
                ue0Var.O.y1(0, true, null, true);
                ue0Var.n();
                return;
            case 1:
                ue0 ue0Var2 = this.f39857b;
                ue0Var2.O.f38211p0.popup = false;
                ue0Var2.h(null);
                return;
            case 2:
                ue0 ue0Var3 = this.f39857b;
                ig0 ig0Var = ue0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                alertDialog$Builder.f20678a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f20678a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ne0(ue0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ne0(ue0Var3, 4));
                ig0Var.showDialog(alertDialog$Builder.f20678a);
                return;
            case 3:
                ue0 ue0Var4 = this.f39857b;
                ue0Var4.O.f38211p0.popup = false;
                ue0Var4.h(null);
                return;
            default:
                ue0 ue0Var5 = this.f39857b;
                ue0Var5.c(true);
                ue0Var5.O.y1(0, true, null, true);
                return;
        }
    }
}
