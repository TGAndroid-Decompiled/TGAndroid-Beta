package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kz0 implements org.telegram.ui.ActionBar.b2 {
    public final int f30281a;
    public final mz0 f30282b;

    public kz0(mz0 mz0Var, int i9) {
        this.f30281a = i9;
        this.f30282b = mz0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f30281a) {
            case 0:
                this.f30282b.a();
                return;
            case 1:
                mz0 mz0Var = this.f30282b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mz0Var.getContext());
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new kz0(mz0Var, 2));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                mz0 mz0Var2 = this.f30282b;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(mz0Var2.getContext(), 3, null);
                c2Var2.f22766c0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(mz0Var2.d).sendRequest(deleteaccount, new org.telegram.ui.rc(23, mz0Var2, c2Var2));
                c2Var2.show();
                return;
        }
    }
}
