package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r01 implements org.telegram.ui.ActionBar.a2 {
    public final int f27715a;
    public final t01 f27716b;

    public r01(t01 t01Var, int i10) {
        this.f27715a = i10;
        this.f27716b = t01Var;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27715a) {
            case 0:
                this.f27716b.a();
                return;
            case 1:
                t01 t01Var = this.f27716b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t01Var.getContext());
                alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new r01(t01Var, 2));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                t01 t01Var2 = this.f27716b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(t01Var2.getContext(), 3, null);
                b2Var2.f18690g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(t01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.oo(16, t01Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
