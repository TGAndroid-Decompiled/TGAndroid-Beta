package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class iy0 implements org.telegram.ui.ActionBar.p1 {
    public final int f34858a;
    public final ky0 f34859b;

    public iy0(ky0 ky0Var, int i3) {
        this.f34858a = i3;
        this.f34859b = ky0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.f34858a;
        ky0 ky0Var = this.f34859b;
        switch (i10) {
            case 0:
                ky0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ky0Var.getContext());
                String M0 = org.telegram.messenger.bd.M0(2131743986, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                s1Var2.U = M0;
                s1Var2.S = org.telegram.messenger.bd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751653, null), new iy0(ky0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, ky0Var.getContext(), null);
                s1Var3.f28546j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(ky0Var.d).sendRequest(deleteaccount, new org.telegram.ui.ActionBar.h6(25, ky0Var, s1Var3));
                s1Var3.show();
                return;
        }
    }
}
