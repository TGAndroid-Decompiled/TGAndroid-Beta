package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ky0 implements org.telegram.ui.ActionBar.r1 {
    public final int f35514a;
    public final my0 f35515b;

    public ky0(my0 my0Var, int i7) {
        this.f35514a = i7;
        this.f35515b = my0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f35514a;
        my0 my0Var = this.f35515b;
        switch (i10) {
            case 0:
                my0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(my0Var.getContext());
                String M0 = org.telegram.messenger.id.M0(2131743976, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27296a;
                u1Var2.T = M0;
                u1Var2.R = org.telegram.messenger.id.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751652, null), new ky0(my0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, my0Var.getContext(), null);
                u1Var3.f28563i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(my0Var.d).sendRequest(deleteaccount, new org.telegram.ui.ld(22, my0Var, u1Var3));
                u1Var3.show();
                return;
        }
    }
}
