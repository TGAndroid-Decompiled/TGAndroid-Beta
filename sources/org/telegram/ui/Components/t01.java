package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t01 implements org.telegram.ui.ActionBar.z1 {
    public final int f28396a;
    public final v01 f28397b;

    public t01(v01 v01Var, int i10) {
        this.f28396a = i10;
        this.f28397b = v01Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f28396a) {
            case 0:
                this.f28397b.a();
                return;
            case 1:
                v01 v01Var = this.f28397b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v01Var.getContext());
                alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new t01(v01Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                v01 v01Var2 = this.f28397b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(v01Var2.getContext(), 3, null);
                a2Var2.f18699g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(v01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, v01Var2, a2Var2));
                a2Var2.show();
                return;
        }
    }
}
