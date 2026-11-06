package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jy0 implements org.telegram.ui.ActionBar.r1 {
    public final int f35105a;
    public final ly0 f35106b;

    public jy0(ly0 ly0Var, int i7) {
        this.f35105a = i7;
        this.f35106b = ly0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f35105a;
        ly0 ly0Var = this.f35106b;
        switch (i10) {
            case 0:
                ly0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ly0Var.getContext());
                String M0 = org.telegram.messenger.hd.M0(2131743977, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27293a;
                u1Var2.T = M0;
                u1Var2.R = org.telegram.messenger.hd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751653, null), new jy0(ly0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, ly0Var.getContext(), null);
                u1Var3.f28569i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(ly0Var.d).sendRequest(deleteaccount, new org.telegram.ui.ld(22, ly0Var, u1Var3));
                u1Var3.show();
                return;
        }
    }
}
