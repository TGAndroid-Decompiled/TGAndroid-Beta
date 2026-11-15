package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e8 implements Runnable {
    public final int f43802a;
    public final f8 f43803b;

    public e8(f8 f8Var, int i7) {
        this.f43802a = i7;
        this.f43803b = f8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43802a;
        f8 f8Var = this.f43803b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f8Var.getParentActivity(), f8Var.getResourceProvider());
                alertDialog$Builder.f28392a.U = hd.M0(2131743124, null);
                i5.c.C(null, 2131747831, alertDialog$Builder, null);
                return;
            default:
                f8Var.d0();
                return;
        }
    }
}
