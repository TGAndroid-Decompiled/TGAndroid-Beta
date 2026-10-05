package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c11 implements org.telegram.ui.ActionBar.a2 {
    public final int f25224a;
    public final e11 f25225b;

    public c11(e11 e11Var, int i10) {
        this.f25224a = i10;
        this.f25225b = e11Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25224a) {
            case 0:
                this.f25225b.a();
                return;
            case 1:
                e11 e11Var = this.f25225b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e11Var.getContext());
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new c11(e11Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                e11 e11Var2 = this.f25225b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(e11Var2.getContext(), 3, null);
                b2Var2.f20432g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(e11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.no(16, e11Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
