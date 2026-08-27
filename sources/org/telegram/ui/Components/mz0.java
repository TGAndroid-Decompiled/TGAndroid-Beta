package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class mz0 implements org.telegram.ui.ActionBar.a2 {

    public final int f30795a;

    public final oz0 f30796b;

    public mz0(oz0 oz0Var, int i10) {
        this.f30795a = i10;
        this.f30796b = oz0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30795a) {
            case 0:
                this.f30796b.a();
                break;
            case 1:
                oz0 oz0Var = this.f30796b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oz0Var.getContext());
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new mz0(oz0Var, 2));
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                oz0 oz0Var2 = this.f30796b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(oz0Var2.getContext(), 3, null);
                b2Var2.f22747c0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(oz0Var2.d).sendRequest(deleteaccount, new org.telegram.ui.gg(20, oz0Var2, b2Var2));
                b2Var2.show();
                break;
        }
    }
}
