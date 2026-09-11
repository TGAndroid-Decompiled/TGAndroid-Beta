package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j8 implements Runnable {
    public final int f37688a;
    public final k9 f37689b;

    public j8(k9 k9Var, int i10) {
        this.f37688a = i10;
        this.f37689b = k9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.yc a02;
        switch (this.f37688a) {
            case 0:
                k9 k9Var = this.f37689b;
                k9Var.f0();
                k9Var.i0();
                return;
            case 1:
                k9 k9Var2 = this.f37689b;
                k9Var2.n0(false);
                if (k9Var2.f37975w) {
                    a02 = org.telegram.ui.Components.yc.X();
                } else {
                    a02 = org.telegram.ui.Components.yc.a0(k9Var2);
                }
                org.telegram.ui.Components.qc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new j8(k9Var2, 5));
                I.f29679j = 5000;
                I.j();
                return;
            case 2:
                this.f37689b.p0(true);
                return;
            case 3:
                k9 k9Var3 = this.f37689b;
                k9Var3.h0();
                k9Var3.f0();
                return;
            case 4:
                this.f37689b.n0(false);
                return;
            case 5:
                this.f37689b.n0(true);
                return;
            default:
                k9 k9Var4 = this.f37689b;
                k9Var4.d.postOnAnimation(new j8(k9Var4, 3));
                return;
        }
    }
}
