package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e8 implements Runnable {
    public final int f42430a;
    public final f8 f42431b;

    public e8(f8 f8Var, int i7) {
        this.f42430a = i7;
        this.f42431b = f8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42430a;
        f8 f8Var = this.f42431b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f8Var.getParentActivity(), f8Var.getResourceProvider());
                alertDialog$Builder.f27293a.T = hd.M0(2131743125, null);
                jg.g.C(null, 2131747830, alertDialog$Builder, null);
                return;
            default:
                f8Var.d0();
                return;
        }
    }
}
