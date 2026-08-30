package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h01 implements org.telegram.ui.ActionBar.c2 {
    public final int f25304a;
    public final j01 f25305b;

    public h01(j01 j01Var, int i10) {
        this.f25304a = i10;
        this.f25305b = j01Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f25304a) {
            case 0:
                this.f25305b.a();
                return;
            case 1:
                j01 j01Var = this.f25305b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j01Var.getContext());
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new h01(j01Var, 2));
                kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                j01 j01Var2 = this.f25305b;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(j01Var2.getContext(), 3, null);
                d2Var2.f19590d0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(j01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, j01Var2, d2Var2));
                d2Var2.show();
                return;
        }
    }
}
