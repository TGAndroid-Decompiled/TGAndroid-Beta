package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c01 implements org.telegram.ui.ActionBar.a2 {
    public final int f24837a;
    public final e01 f24838b;

    public c01(e01 e01Var, int i10) {
        this.f24837a = i10;
        this.f24838b = e01Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24837a) {
            case 0:
                this.f24838b.a();
                return;
            case 1:
                e01 e01Var = this.f24838b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e01Var.getContext());
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new c01(e01Var, 2));
                i2.g.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                e01 e01Var2 = this.f24838b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(e01Var2.getContext(), 3, null);
                b2Var2.f20237g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(e01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.ro(16, e01Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
