package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i01 implements org.telegram.ui.ActionBar.c2 {
    public final int f27640a;
    public final k01 f27641b;

    public i01(k01 k01Var, int i10) {
        this.f27640a = i10;
        this.f27641b = k01Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27640a) {
            case 0:
                this.f27641b.a();
                return;
            case 1:
                k01 k01Var = this.f27641b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k01Var.getContext());
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new i01(k01Var, 2));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                k01 k01Var2 = this.f27641b;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(k01Var2.getContext(), 3, null);
                d2Var2.f21241d0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(k01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, k01Var2, d2Var2));
                d2Var2.show();
                return;
        }
    }
}
