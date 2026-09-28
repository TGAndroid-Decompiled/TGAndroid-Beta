package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s01 implements org.telegram.ui.ActionBar.z1 {
    public final int f28101a;
    public final u01 f28102b;

    public s01(u01 u01Var, int i10) {
        this.f28101a = i10;
        this.f28102b = u01Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f28101a) {
            case 0:
                this.f28102b.a();
                return;
            case 1:
                u01 u01Var = this.f28102b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u01Var.getContext());
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new s01(u01Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                u01 u01Var2 = this.f28102b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(u01Var2.getContext(), 3, null);
                a2Var2.f18683g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(u01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, u01Var2, a2Var2));
                a2Var2.show();
                return;
        }
    }
}
