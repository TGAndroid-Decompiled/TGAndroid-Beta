package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o11 implements org.telegram.ui.ActionBar.b2 {
    public final int f31131a;
    public final q11 f31132b;

    public o11(q11 q11Var, int i10) {
        this.f31131a = i10;
        this.f31132b = q11Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f31131a) {
            case 0:
                this.f31132b.a();
                return;
            case 1:
                q11 q11Var = this.f31132b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q11Var.getContext());
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new o11(q11Var, 2));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                q11 q11Var2 = this.f31132b;
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(q11Var2.getContext(), 3, null);
                e2Var2.f22576i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(q11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.z7(24, q11Var2, e2Var2));
                e2Var2.show();
                return;
        }
    }
}
