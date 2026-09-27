package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o8 implements Runnable {
    public final int f36153a;
    public final n9 f36154b;

    public o8(n9 n9Var, int i10) {
        this.f36153a = i10;
        this.f36154b = n9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        switch (this.f36153a) {
            case 0:
                n9 n9Var = this.f36154b;
                n9Var.o0(false);
                if (n9Var.v) {
                    a02 = org.telegram.ui.Components.xc.X();
                } else {
                    a02 = org.telegram.ui.Components.xc.a0(n9Var);
                }
                org.telegram.ui.Components.qc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new o8(n9Var, 3));
                I.f27691j = 5000;
                I.j();
                return;
            case 1:
                this.f36154b.q0(true);
                return;
            case 2:
                this.f36154b.o0(false);
                return;
            case 3:
                this.f36154b.o0(true);
                return;
            default:
                n9.Z(this.f36154b);
                return;
        }
    }
}
