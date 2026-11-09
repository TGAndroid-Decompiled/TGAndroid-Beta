package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c8 implements Runnable {
    public final int f42319a;
    public final d8 f42320b;

    public c8(d8 d8Var, int i7) {
        this.f42319a = i7;
        this.f42320b = d8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42319a;
        d8 d8Var = this.f42320b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d8Var.getParentActivity(), d8Var.getResourceProvider());
                alertDialog$Builder.f27296a.T = id.M0(2131743124, null);
                jg.g.C(null, 2131747831, alertDialog$Builder, null);
                return;
            default:
                d8Var.d0();
                return;
        }
    }
}
