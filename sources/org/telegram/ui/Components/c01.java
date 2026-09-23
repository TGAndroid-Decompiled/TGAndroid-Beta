package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c01 implements org.telegram.ui.ActionBar.a2 {
    public final int f22876a;
    public final e01 f22877b;

    public c01(e01 e01Var, int i10) {
        this.f22876a = i10;
        this.f22877b = e01Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f22876a) {
            case 0:
                this.f22877b.a();
                return;
            case 1:
                e01 e01Var = this.f22877b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e01Var.getContext());
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new c01(e01Var, 2));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                e01 e01Var2 = this.f22877b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(e01Var2.getContext(), 3, null);
                b2Var2.f18459g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(e01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.mo(16, e01Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
