package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i8 implements Runnable {
    public final int f38534a;
    public final j9 f38535b;

    public i8(j9 j9Var, int i10) {
        this.f38534a = i10;
        this.f38535b = j9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ad a02;
        switch (this.f38534a) {
            case 0:
                j9 j9Var = this.f38535b;
                j9Var.f0();
                j9Var.i0();
                return;
            case 1:
                j9 j9Var2 = this.f38535b;
                j9Var2.n0(false);
                if (j9Var2.f38878w) {
                    a02 = org.telegram.ui.Components.ad.X();
                } else {
                    a02 = org.telegram.ui.Components.ad.a0(j9Var2);
                }
                org.telegram.ui.Components.tc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new i8(j9Var2, 5));
                I.f31130j = 5000;
                I.j();
                return;
            case 2:
                this.f38535b.p0(true);
                return;
            case 3:
                j9 j9Var3 = this.f38535b;
                j9Var3.h0();
                j9Var3.f0();
                return;
            case 4:
                this.f38535b.n0(false);
                return;
            case 5:
                this.f38535b.n0(true);
                return;
            default:
                j9 j9Var4 = this.f38535b;
                j9Var4.d.postOnAnimation(new i8(j9Var4, 3));
                return;
        }
    }
}
