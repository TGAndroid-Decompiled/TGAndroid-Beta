package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f11 implements org.telegram.ui.ActionBar.z1 {
    public final int f24552a;
    public final h11 f24553b;

    public f11(h11 h11Var, int i10) {
        this.f24552a = i10;
        this.f24553b = h11Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f24552a) {
            case 0:
                this.f24553b.a();
                return;
            case 1:
                h11 h11Var = this.f24553b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h11Var.getContext());
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new f11(h11Var, 2));
                i2.d.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                h11 h11Var2 = this.f24553b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(h11Var2.getContext(), 3, null);
                a2Var2.f19269g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(h11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.to(16, h11Var2, a2Var2));
                a2Var2.show();
                return;
        }
    }
}
