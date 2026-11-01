package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oz0 implements org.telegram.ui.ActionBar.u1 {
    public final int f29256a;
    public final qz0 f29257b;

    public oz0(qz0 qz0Var, int i10) {
        this.f29256a = i10;
        this.f29257b = qz0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.f29256a;
        qz0 qz0Var = this.f29257b;
        switch (i11) {
            case 0:
                qz0Var.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qz0Var.getContext());
                String L0 = org.telegram.messenger.dd.L0(2131744001, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
                x1Var2.T = L0;
                x1Var2.R = org.telegram.messenger.dd.L0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751653, null), new oz0(qz0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, qz0Var.getContext(), null);
                x1Var3.f21489i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(qz0Var.d).sendRequest(deleteaccount, new t20(6, qz0Var, x1Var3));
                x1Var3.show();
                return;
        }
    }
}
