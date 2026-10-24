package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m8 implements Runnable {
    public final int f39455a;
    public final m9 f39456b;

    public m8(m9 m9Var, int i10) {
        this.f39455a = i10;
        this.f39456b = m9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vc a02;
        switch (this.f39455a) {
            case 0:
                m9 m9Var = this.f39456b;
                m9Var.e0();
                m9Var.h0();
                return;
            case 1:
                m9 m9Var2 = this.f39456b;
                m9Var2.m0(false);
                if (m9Var2.f39485w) {
                    a02 = org.telegram.ui.Components.vc.X();
                } else {
                    a02 = org.telegram.ui.Components.vc.a0(m9Var2);
                }
                org.telegram.ui.Components.oc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new m8(m9Var2, 5));
                I.f29203j = 5000;
                I.j();
                return;
            case 2:
                this.f39456b.o0(true);
                return;
            case 3:
                m9 m9Var3 = this.f39456b;
                m9Var3.g0();
                m9Var3.e0();
                return;
            case 4:
                this.f39456b.m0(false);
                return;
            case 5:
                this.f39456b.m0(true);
                return;
            default:
                m9 m9Var4 = this.f39456b;
                m9Var4.d.postOnAnimation(new m8(m9Var4, 3));
                return;
        }
    }
}
