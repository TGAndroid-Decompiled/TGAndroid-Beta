package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h01 implements org.telegram.ui.ActionBar.c2 {
    public final int f27325a;
    public final j01 f27326b;

    public h01(j01 j01Var, int i10) {
        this.f27325a = i10;
        this.f27326b = j01Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27325a) {
            case 0:
                this.f27326b.a();
                return;
            case 1:
                j01 j01Var = this.f27326b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j01Var.getContext());
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new h01(j01Var, 2));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                j01 j01Var2 = this.f27326b;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(j01Var2.getContext(), 3, null);
                d2Var2.f21243d0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(j01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, j01Var2, d2Var2));
                d2Var2.show();
                return;
        }
    }
}
