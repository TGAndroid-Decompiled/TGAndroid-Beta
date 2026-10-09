package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i11 implements org.telegram.ui.ActionBar.a2 {
    public final int f27192a;
    public final k11 f27193b;

    public i11(k11 k11Var, int i10) {
        this.f27192a = i10;
        this.f27193b = k11Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27192a) {
            case 0:
                this.f27193b.a();
                return;
            case 1:
                k11 k11Var = this.f27193b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k11Var.getContext());
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new i11(k11Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                k11 k11Var2 = this.f27193b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(k11Var2.getContext(), 3, null);
                b2Var2.f20420g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(k11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.oo(16, k11Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
