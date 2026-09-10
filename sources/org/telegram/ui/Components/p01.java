package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p01 implements org.telegram.ui.ActionBar.c2 {
    public final int f25970a;
    public final s01 f25971b;

    public p01(s01 s01Var, int i10) {
        this.f25970a = i10;
        this.f25971b = s01Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f25970a) {
            case 0:
                this.f25971b.a();
                return;
            case 1:
                s01 s01Var = this.f25971b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s01Var.getContext());
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new p01(s01Var, 2));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                s01 s01Var2 = this.f25971b;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(s01Var2.getContext(), 3, null);
                d2Var2.f17621g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(s01Var2.d).sendRequest(deleteaccount, new th(11, s01Var2, d2Var2));
                d2Var2.show();
                return;
        }
    }
}
