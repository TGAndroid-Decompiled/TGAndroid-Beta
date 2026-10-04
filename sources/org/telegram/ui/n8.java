package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n8 implements Runnable {
    public final int f38845a;
    public final m9 f38846b;

    public n8(m9 m9Var, int i10) {
        this.f38845a = i10;
        this.f38846b = m9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.yc a02;
        switch (this.f38845a) {
            case 0:
                m9 m9Var = this.f38846b;
                m9Var.h0(false);
                if (m9Var.v) {
                    a02 = org.telegram.ui.Components.yc.X();
                } else {
                    a02 = org.telegram.ui.Components.yc.a0(m9Var);
                }
                org.telegram.ui.Components.rc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new n8(m9Var, 3));
                I.f30345j = 5000;
                I.j();
                return;
            case 1:
                this.f38846b.j0(true);
                return;
            case 2:
                this.f38846b.h0(false);
                return;
            case 3:
                this.f38846b.h0(true);
                return;
            default:
                this.f38846b.c0();
                return;
        }
    }
}
