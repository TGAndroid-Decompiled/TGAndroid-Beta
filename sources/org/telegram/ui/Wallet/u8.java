package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u8 implements Runnable {
    public final int f45246a;
    public final v8 f45247b;

    public u8(v8 v8Var, int i7) {
        this.f45246a = i7;
        this.f45247b = v8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45246a;
        v8 v8Var = this.f45247b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v8Var.getParentActivity(), v8Var.getResourceProvider());
                alertDialog$Builder.f28835a.U = gd.N0(2131742873, null);
                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                return;
            default:
                v8Var.d0();
                return;
        }
    }
}
