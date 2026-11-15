package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ly0 implements org.telegram.ui.ActionBar.q1 {
    public final int f37013a;
    public final ny0 f37014b;

    public ly0(ny0 ny0Var, int i7) {
        this.f37013a = i7;
        this.f37014b = ny0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f37013a;
        ny0 ny0Var = this.f37014b;
        switch (i10) {
            case 0:
                ny0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ny0Var.getContext());
                String M0 = org.telegram.messenger.hd.M0(2131743976, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28392a;
                t1Var2.U = M0;
                t1Var2.S = org.telegram.messenger.hd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751652, null), new ly0(ny0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, ny0Var.getContext(), null);
                t1Var3.f29637j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(ny0Var.d).sendRequest(deleteaccount, new org.telegram.ui.v7(24, ny0Var, t1Var3));
                t1Var3.show();
                return;
        }
    }
}
