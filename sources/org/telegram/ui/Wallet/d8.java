package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d8 implements Runnable {
    public final int f42400a;
    public final e8 f42401b;

    public d8(e8 e8Var, int i7) {
        this.f42400a = i7;
        this.f42401b = e8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42400a;
        e8 e8Var = this.f42401b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
                alertDialog$Builder.f27296a.T = id.M0(2131743127, null);
                jg.g.C(null, 2131747832, alertDialog$Builder, null);
                return;
            default:
                e8Var.d0();
                return;
        }
    }
}
