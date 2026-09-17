package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l8 implements Runnable {
    public final int f35473a;
    public final m9 f35474b;

    public l8(m9 m9Var, int i10) {
        this.f35473a = i10;
        this.f35474b = m9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vc a02;
        switch (this.f35473a) {
            case 0:
                m9 m9Var = this.f35474b;
                m9Var.f0();
                m9Var.i0();
                return;
            case 1:
                m9 m9Var2 = this.f35474b;
                m9Var2.n0(false);
                if (m9Var2.f35720w) {
                    a02 = org.telegram.ui.Components.vc.X();
                } else {
                    a02 = org.telegram.ui.Components.vc.a0(m9Var2);
                }
                org.telegram.ui.Components.oc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new l8(m9Var2, 5));
                I.f26702j = 5000;
                I.j();
                return;
            case 2:
                this.f35474b.p0(true);
                return;
            case 3:
                m9 m9Var3 = this.f35474b;
                m9Var3.h0();
                m9Var3.f0();
                return;
            case 4:
                this.f35474b.n0(false);
                return;
            case 5:
                this.f35474b.n0(true);
                return;
            default:
                m9 m9Var4 = this.f35474b;
                m9Var4.d.postOnAnimation(new l8(m9Var4, 3));
                return;
        }
    }
}
