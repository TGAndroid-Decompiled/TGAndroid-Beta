package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o11 implements org.telegram.ui.ActionBar.z1 {
    public final int f29026a;
    public final q11 f29027b;

    public o11(q11 q11Var, int i10) {
        this.f29026a = i10;
        this.f29027b = q11Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29026a) {
            case 0:
                this.f29027b.a();
                return;
            case 1:
                q11 q11Var = this.f29027b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q11Var.getContext());
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new o11(q11Var, 2));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                q11 q11Var2 = this.f29027b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(q11Var2.getContext(), 3, null);
                a2Var2.f20163g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(q11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.so(16, q11Var2, a2Var2));
                a2Var2.show();
                return;
        }
    }
}
