package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r01 implements org.telegram.ui.ActionBar.z1 {
    public final int f27800a;
    public final t01 f27801b;

    public r01(t01 t01Var, int i10) {
        this.f27800a = i10;
        this.f27801b = t01Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27800a) {
            case 0:
                this.f27801b.a();
                return;
            case 1:
                t01 t01Var = this.f27801b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t01Var.getContext());
                alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new r01(t01Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                t01 t01Var2 = this.f27801b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(t01Var2.getContext(), 3, null);
                a2Var2.f18682g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(t01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, t01Var2, a2Var2));
                a2Var2.show();
                return;
        }
    }
}
