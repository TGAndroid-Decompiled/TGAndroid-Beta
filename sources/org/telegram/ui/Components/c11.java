package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c11 implements org.telegram.ui.ActionBar.a2 {
    public final int f25085a;
    public final e11 f25086b;

    public c11(e11 e11Var, int i10) {
        this.f25085a = i10;
        this.f25086b = e11Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25085a) {
            case 0:
                this.f25086b.a();
                return;
            case 1:
                e11 e11Var = this.f25086b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e11Var.getContext());
                alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new c11(e11Var, 2));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                e11 e11Var2 = this.f25086b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(e11Var2.getContext(), 3, null);
                b2Var2.f20665g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(e11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.vc(23, e11Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
