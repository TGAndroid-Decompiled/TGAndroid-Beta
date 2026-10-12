package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e11 implements org.telegram.ui.ActionBar.z1 {
    public final int f24561a;
    public final g11 f24562b;

    public e11(g11 g11Var, int i10) {
        this.f24561a = i10;
        this.f24562b = g11Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f24561a) {
            case 0:
                this.f24562b.a();
                return;
            case 1:
                g11 g11Var = this.f24562b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var.getContext());
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new e11(g11Var, 2));
                org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                g11 g11Var2 = this.f24562b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(g11Var2.getContext(), 3, null);
                a2Var2.f19569g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(g11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.to(16, g11Var2, a2Var2));
                a2Var2.show();
                return;
        }
    }
}
