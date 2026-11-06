package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class iy0 implements org.telegram.ui.ActionBar.r1 {
    public final int f34788a;
    public final ky0 f34789b;

    public iy0(ky0 ky0Var, int i7) {
        this.f34788a = i7;
        this.f34789b = ky0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f34788a;
        ky0 ky0Var = this.f34789b;
        switch (i10) {
            case 0:
                ky0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ky0Var.getContext());
                String M0 = org.telegram.messenger.hd.M0(2131743977, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27292a;
                u1Var2.T = M0;
                u1Var2.R = org.telegram.messenger.hd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751653, null), new iy0(ky0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, ky0Var.getContext(), null);
                u1Var3.f28568i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(ky0Var.d).sendRequest(deleteaccount, new org.telegram.ui.ld(22, ky0Var, u1Var3));
                u1Var3.show();
                return;
        }
    }
}
