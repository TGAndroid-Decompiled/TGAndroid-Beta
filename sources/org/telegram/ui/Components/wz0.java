package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wz0 implements org.telegram.ui.ActionBar.b2 {
    public final int f34519a;
    public final yz0 f34520b;

    public wz0(yz0 yz0Var, int i10) {
        this.f34519a = i10;
        this.f34520b = yz0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34519a) {
            case 0:
                this.f34520b.a();
                return;
            case 1:
                yz0 yz0Var = this.f34520b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yz0Var.getContext());
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new wz0(yz0Var, 2));
                j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                yz0 yz0Var2 = this.f34520b;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(yz0Var2.getContext(), 3, null);
                c2Var2.f22783c0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(yz0Var2.d).sendRequest(deleteaccount, new org.telegram.ui.zg(19, yz0Var2, c2Var2));
                c2Var2.show();
                return;
        }
    }
}
