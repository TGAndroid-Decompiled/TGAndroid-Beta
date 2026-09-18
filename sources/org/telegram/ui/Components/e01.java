package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e01 implements org.telegram.ui.ActionBar.b2 {
    public final int f23443a;
    public final g01 f23444b;

    public e01(g01 g01Var, int i10) {
        this.f23443a = i10;
        this.f23444b = g01Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f23443a) {
            case 0:
                this.f23444b.a();
                return;
            case 1:
                g01 g01Var = this.f23444b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g01Var.getContext());
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new e01(g01Var, 2));
                hg.k0.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                g01 g01Var2 = this.f23444b;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(g01Var2.getContext(), 3, null);
                c2Var2.f18503g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(g01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.qo(16, g01Var2, c2Var2));
                c2Var2.show();
                return;
        }
    }
}
