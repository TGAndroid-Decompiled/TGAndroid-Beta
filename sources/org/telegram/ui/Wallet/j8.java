package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j8 implements Runnable {
    public final int f34759a;
    public final k8 f34760b;

    public j8(k8 k8Var, int i10) {
        this.f34759a = i10;
        this.f34760b = k8Var;
    }

    @Override
    public final void run() {
        int i10 = this.f34759a;
        k8 k8Var = this.f34760b;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k8Var.getParentActivity(), k8Var.getResourceProvider());
                alertDialog$Builder.f20134a.T = cd.L0(2131743150, null);
                i0.a.w(null, 2131747847, alertDialog$Builder, null);
                return;
            default:
                k8Var.c0();
                return;
        }
    }
}
