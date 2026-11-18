package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sy0 implements org.telegram.ui.ActionBar.r1 {
    public final int f39864a;
    public final uy0 f39865b;

    public sy0(uy0 uy0Var, int i7) {
        this.f39864a = i7;
        this.f39865b = uy0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f39864a;
        uy0 uy0Var = this.f39865b;
        switch (i10) {
            case 0:
                uy0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uy0Var.getContext());
                String M0 = org.telegram.messenger.gd.M0(2131743739, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f28744a;
                u1Var2.U = M0;
                u1Var2.S = org.telegram.messenger.gd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751641, null), new sy0(uy0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, uy0Var.getContext(), null);
                u1Var3.f30047j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(uy0Var.d).sendRequest(deleteaccount, new org.telegram.ui.u7(24, uy0Var, u1Var3));
                u1Var3.show();
                return;
        }
    }
}
