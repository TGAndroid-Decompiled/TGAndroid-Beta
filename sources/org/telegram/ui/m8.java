package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m8 implements Runnable {
    public final int f39025a;
    public final m9 f39026b;

    public m8(m9 m9Var, int i10) {
        this.f39025a = i10;
        this.f39026b = m9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        switch (this.f39025a) {
            case 0:
                m9 m9Var = this.f39026b;
                m9Var.f0();
                m9Var.i0();
                return;
            case 1:
                m9 m9Var2 = this.f39026b;
                m9Var2.n0(false);
                if (m9Var2.f39045w) {
                    a02 = org.telegram.ui.Components.xc.X();
                } else {
                    a02 = org.telegram.ui.Components.xc.a0(m9Var2);
                }
                org.telegram.ui.Components.qc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new m8(m9Var2, 5));
                I.f29639j = 5000;
                I.j();
                return;
            case 2:
                this.f39026b.p0(true);
                return;
            case 3:
                m9 m9Var3 = this.f39026b;
                m9Var3.h0();
                m9Var3.f0();
                return;
            case 4:
                this.f39026b.n0(false);
                return;
            case 5:
                this.f39026b.n0(true);
                return;
            default:
                m9 m9Var4 = this.f39026b;
                m9Var4.d.postOnAnimation(new m8(m9Var4, 3));
                return;
        }
    }
}
