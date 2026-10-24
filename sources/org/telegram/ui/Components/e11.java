package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e11 implements org.telegram.ui.ActionBar.z1 {
    public final int f25921a;
    public final g11 f25922b;

    public e11(g11 g11Var, int i10) {
        this.f25921a = i10;
        this.f25922b = g11Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f25921a) {
            case 0:
                this.f25922b.a();
                return;
            case 1:
                g11 g11Var = this.f25922b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var.getContext());
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new e11(g11Var, 2));
                i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                g11 g11Var2 = this.f25922b;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(g11Var2.getContext(), 3, null);
                c2Var2.f20763i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(g11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.vc(23, g11Var2, c2Var2));
                c2Var2.show();
                return;
        }
    }
}
