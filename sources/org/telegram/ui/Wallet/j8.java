package org.telegram.ui.Wallet;

import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j8 implements Runnable {
    public final int f34764a;
    public final k8 f34765b;

    public j8(k8 k8Var, int i10) {
        this.f34764a = i10;
        this.f34765b = k8Var;
    }

    @Override
    public final void run() {
        int i10 = this.f34764a;
        k8 k8Var = this.f34765b;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k8Var.getParentActivity(), k8Var.getResourceProvider());
                alertDialog$Builder.f20135a.T = dd.L0(2131743150, null);
                i0.a.w(null, 2131747847, alertDialog$Builder, null);
                return;
            default:
                k8Var.d0();
                return;
        }
    }
}
