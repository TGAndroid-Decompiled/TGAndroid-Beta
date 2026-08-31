package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l8 implements Runnable {
    public final int f38664a;
    public final l9 f38665b;

    public l8(l9 l9Var, int i10) {
        this.f38664a = i10;
        this.f38665b = l9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        switch (this.f38664a) {
            case 0:
                l9 l9Var = this.f38665b;
                l9Var.f0();
                l9Var.i0();
                return;
            case 1:
                l9 l9Var2 = this.f38665b;
                l9Var2.n0(false);
                if (l9Var2.f38679w) {
                    a02 = org.telegram.ui.Components.qc.X();
                } else {
                    a02 = org.telegram.ui.Components.qc.a0(l9Var2);
                }
                org.telegram.ui.Components.ic I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new l8(l9Var2, 5));
                I.f27745j = 5000;
                I.j();
                return;
            case 2:
                this.f38665b.p0(true);
                return;
            case 3:
                l9 l9Var3 = this.f38665b;
                l9Var3.h0();
                l9Var3.f0();
                return;
            case 4:
                this.f38665b.n0(false);
                return;
            case 5:
                this.f38665b.n0(true);
                return;
            default:
                l9 l9Var4 = this.f38665b;
                l9Var4.d.postOnAnimation(new l8(l9Var4, 3));
                return;
        }
    }
}
