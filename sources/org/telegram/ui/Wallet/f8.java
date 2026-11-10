package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f8 implements Runnable {
    public final int f42507a;
    public final g8 f42508b;

    public f8(g8 g8Var, int i7) {
        this.f42507a = i7;
        this.f42508b = g8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42507a;
        g8 g8Var = this.f42508b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g8Var.getParentActivity(), g8Var.getResourceProvider());
                alertDialog$Builder.f27300a.T = id.M0(2131743124, null);
                jg.g.C(null, 2131747831, alertDialog$Builder, null);
                return;
            default:
                g8Var.d0();
                return;
        }
    }
}
