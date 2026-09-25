package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class q01 implements org.telegram.ui.ActionBar.z1 {
    public final int f27474a;
    public final s01 f27475b;

    public q01(s01 s01Var, int i10) {
        this.f27474a = i10;
        this.f27475b = s01Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27474a) {
            case 0:
                this.f27475b.a();
                return;
            case 1:
                s01 s01Var = this.f27475b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s01Var.getContext());
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new q01(s01Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                s01 s01Var2 = this.f27475b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(s01Var2.getContext(), 3, null);
                a2Var2.f18683g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(s01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, s01Var2, a2Var2));
                a2Var2.show();
                return;
        }
    }
}
