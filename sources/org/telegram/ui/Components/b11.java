package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b11 implements org.telegram.ui.ActionBar.a2 {
    public final int f24773a;
    public final d11 f24774b;

    public b11(d11 d11Var, int i10) {
        this.f24773a = i10;
        this.f24774b = d11Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24773a) {
            case 0:
                this.f24774b.a();
                return;
            case 1:
                d11 d11Var = this.f24774b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d11Var.getContext());
                alertDialog$Builder.f20602a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new b11(d11Var, 2));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                d11 d11Var2 = this.f24774b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(d11Var2.getContext(), 3, null);
                b2Var2.f20662g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(d11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.vc(23, d11Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
