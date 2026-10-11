package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k11 implements org.telegram.ui.ActionBar.z1 {
    public final int f27814a;
    public final m11 f27815b;

    public k11(m11 m11Var, int i10) {
        this.f27814a = i10;
        this.f27815b = m11Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27814a) {
            case 0:
                this.f27815b.a();
                return;
            case 1:
                m11 m11Var = this.f27815b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m11Var.getContext());
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new k11(m11Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                m11 m11Var2 = this.f27815b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(m11Var2.getContext(), 3, null);
                a2Var2.f20390g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(m11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.oo(16, m11Var2, a2Var2));
                a2Var2.show();
                return;
        }
    }
}
