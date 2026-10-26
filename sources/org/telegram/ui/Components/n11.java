package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n11 implements org.telegram.ui.ActionBar.b2 {
    public final int f30825a;
    public final p11 f30826b;

    public n11(p11 p11Var, int i10) {
        this.f30825a = i10;
        this.f30826b = p11Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f30825a) {
            case 0:
                this.f30826b.a();
                return;
            case 1:
                p11 p11Var = this.f30826b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p11Var.getContext());
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new n11(p11Var, 2));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            default:
                p11 p11Var2 = this.f30826b;
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(p11Var2.getContext(), 3, null);
                e2Var2.f22575i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(p11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.z7(24, p11Var2, e2Var2));
                e2Var2.show();
                return;
        }
    }
}
