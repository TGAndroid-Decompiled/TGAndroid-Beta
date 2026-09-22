package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t01 implements org.telegram.ui.ActionBar.a2 {
    public final int f28365a;
    public final v01 f28366b;

    public t01(v01 v01Var, int i10) {
        this.f28365a = i10;
        this.f28366b = v01Var;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28365a) {
            case 0:
                this.f28366b.a();
                return;
            case 1:
                v01 v01Var = this.f28366b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v01Var.getContext());
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new t01(v01Var, 2));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                v01 v01Var2 = this.f28366b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(v01Var2.getContext(), 3, null);
                b2Var2.f18705g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(v01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.oo(16, v01Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
