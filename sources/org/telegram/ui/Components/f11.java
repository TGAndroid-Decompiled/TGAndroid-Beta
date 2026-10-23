package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f11 implements org.telegram.ui.ActionBar.z1 {
    public final int f26125a;
    public final h11 f26126b;

    public f11(h11 h11Var, int i10) {
        this.f26125a = i10;
        this.f26126b = h11Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f26125a) {
            case 0:
                this.f26126b.a();
                return;
            case 1:
                h11 h11Var = this.f26126b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h11Var.getContext());
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new f11(h11Var, 2));
                i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                h11 h11Var2 = this.f26126b;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(h11Var2.getContext(), 3, null);
                c2Var2.f20762i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(h11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.vc(23, h11Var2, c2Var2));
                c2Var2.show();
                return;
        }
    }
}
