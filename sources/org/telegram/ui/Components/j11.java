package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j11 implements org.telegram.ui.ActionBar.a2 {
    public final int f27508a;
    public final l11 f27509b;

    public j11(l11 l11Var, int i10) {
        this.f27508a = i10;
        this.f27509b = l11Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27508a) {
            case 0:
                this.f27509b.a();
                return;
            case 1:
                l11 l11Var = this.f27509b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l11Var.getContext());
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new j11(l11Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                l11 l11Var2 = this.f27509b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(l11Var2.getContext(), 3, null);
                b2Var2.f20424g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(l11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.oo(16, l11Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
