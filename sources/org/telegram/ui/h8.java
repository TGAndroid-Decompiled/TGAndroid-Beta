package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h8 implements Runnable {
    public final int f38778a;
    public final h9 f38779b;

    public h8(h9 h9Var, int i10) {
        this.f38778a = i10;
        this.f38779b = h9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.tc a02;
        switch (this.f38778a) {
            case 0:
                h9 h9Var = this.f38779b;
                h9Var.f0();
                h9Var.i0();
                return;
            case 1:
                h9 h9Var2 = this.f38779b;
                h9Var2.n0(false);
                if (h9Var2.f38797w) {
                    a02 = org.telegram.ui.Components.tc.X();
                } else {
                    a02 = org.telegram.ui.Components.tc.a0(h9Var2);
                }
                org.telegram.ui.Components.mc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new h8(h9Var2, 5));
                I.f30652j = 5000;
                I.j();
                return;
            case 2:
                this.f38779b.p0(true);
                return;
            case 3:
                h9 h9Var3 = this.f38779b;
                h9Var3.h0();
                h9Var3.f0();
                return;
            case 4:
                this.f38779b.n0(false);
                return;
            case 5:
                this.f38779b.n0(true);
                return;
            default:
                h9 h9Var4 = this.f38779b;
                h9Var4.d.postOnAnimation(new h8(h9Var4, 3));
                return;
        }
    }
}
