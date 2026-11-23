package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ty0 implements org.telegram.ui.ActionBar.q1 {
    public final int f40188a;
    public final vy0 f40189b;

    public ty0(vy0 vy0Var, int i7) {
        this.f40188a = i7;
        this.f40189b = vy0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f40188a;
        vy0 vy0Var = this.f40189b;
        switch (i10) {
            case 0:
                vy0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vy0Var.getContext());
                String N0 = org.telegram.messenger.gd.N0(2131743729, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28835a;
                t1Var2.U = N0;
                t1Var2.S = org.telegram.messenger.gd.N0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751640, null), new ty0(vy0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, vy0Var.getContext(), null);
                t1Var3.f30091j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(vy0Var.d).sendRequest(deleteaccount, new org.telegram.ui.v7(24, vy0Var, t1Var3));
                t1Var3.show();
                return;
        }
    }
}
