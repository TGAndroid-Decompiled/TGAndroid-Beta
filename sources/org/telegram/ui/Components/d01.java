package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d01 implements org.telegram.ui.ActionBar.a2 {
    public final int f23175a;
    public final f01 f23176b;

    public d01(f01 f01Var, int i10) {
        this.f23175a = i10;
        this.f23176b = f01Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f23175a) {
            case 0:
                this.f23176b.a();
                return;
            case 1:
                f01 f01Var = this.f23176b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f01Var.getContext());
                alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new d01(f01Var, 2));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                f01 f01Var2 = this.f23176b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(f01Var2.getContext(), 3, null);
                b2Var2.f18471g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(f01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.qo(16, f01Var2, b2Var2));
                b2Var2.show();
                return;
        }
    }
}
