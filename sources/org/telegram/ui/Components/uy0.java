package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uy0 implements org.telegram.ui.ActionBar.q1 {
    public final int f40558a;
    public final wy0 f40559b;

    public uy0(wy0 wy0Var, int i7) {
        this.f40558a = i7;
        this.f40559b = wy0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f40558a;
        wy0 wy0Var = this.f40559b;
        switch (i10) {
            case 0:
                wy0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wy0Var.getContext());
                String N0 = org.telegram.messenger.hd.N0(2131743733, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28743a;
                t1Var2.U = N0;
                t1Var2.S = org.telegram.messenger.hd.N0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751640, null), new uy0(wy0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, wy0Var.getContext(), null);
                t1Var3.f29999j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(wy0Var.d).sendRequest(deleteaccount, new org.telegram.ui.u7(24, wy0Var, t1Var3));
                t1Var3.show();
                return;
        }
    }
}
