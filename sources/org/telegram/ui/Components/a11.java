package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a11 implements org.telegram.ui.ActionBar.a2 {
    public final int f24456a;
    public final c11 f24457b;

    public a11(c11 c11Var, int i10) {
        this.f24456a = i10;
        this.f24457b = c11Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24456a) {
            case 0:
                this.f24457b.a();
                return;
            case 1:
                c11 c11Var = this.f24457b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c11Var.getContext());
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new a11(c11Var, 2));
                i0.a.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                c11 c11Var2 = this.f24457b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(c11Var2.getContext(), 3, null);
                b2Var2.f20661g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(c11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.xc(23, c11Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
