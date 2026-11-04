package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d8 implements Runnable {
    public final int f42438a;
    public final e8 f42439b;

    public d8(e8 e8Var, int i3) {
        this.f42438a = i3;
        this.f42439b = e8Var;
    }

    @Override
    public final void run() {
        int i3 = this.f42438a;
        e8 e8Var = this.f42439b;
        switch (i3) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
                alertDialog$Builder.f27343a.U = bd.M0(2131743134, null);
                k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                return;
            default:
                e8Var.d0();
                return;
        }
    }
}
