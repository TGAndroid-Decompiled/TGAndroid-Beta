package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nz0 implements org.telegram.ui.ActionBar.u1 {
    public final int f28923a;
    public final pz0 f28924b;

    public nz0(pz0 pz0Var, int i10) {
        this.f28923a = i10;
        this.f28924b = pz0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.f28923a;
        pz0 pz0Var = this.f28924b;
        switch (i11) {
            case 0:
                pz0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pz0Var.getContext());
                String L0 = org.telegram.messenger.cd.L0(2131744001, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20134a;
                x1Var2.T = L0;
                x1Var2.R = org.telegram.messenger.cd.L0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751653, null), new nz0(pz0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, pz0Var.getContext(), null);
                x1Var3.f21488i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(pz0Var.d).sendRequest(deleteaccount, new t20(6, pz0Var, x1Var3));
                x1Var3.show();
                return;
        }
    }
}
