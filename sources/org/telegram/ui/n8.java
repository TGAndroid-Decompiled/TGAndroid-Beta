package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n8 implements Runnable {
    public final int f36404a;
    public final n9 f36405b;

    public n8(n9 n9Var, int i10) {
        this.f36404a = i10;
        this.f36405b = n9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        switch (this.f36404a) {
            case 0:
                n9 n9Var = this.f36405b;
                n9Var.f0();
                n9Var.i0();
                return;
            case 1:
                n9 n9Var2 = this.f36405b;
                n9Var2.n0(false);
                if (n9Var2.f36420w) {
                    a02 = org.telegram.ui.Components.qc.X();
                } else {
                    a02 = org.telegram.ui.Components.qc.a0(n9Var2);
                }
                org.telegram.ui.Components.ic I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new n8(n9Var2, 5));
                I.f25671j = 5000;
                I.j();
                return;
            case 2:
                this.f36405b.p0(true);
                return;
            case 3:
                n9 n9Var3 = this.f36405b;
                n9Var3.h0();
                n9Var3.f0();
                return;
            case 4:
                this.f36405b.n0(false);
                return;
            case 5:
                this.f36405b.n0(true);
                return;
            default:
                n9 n9Var4 = this.f36405b;
                n9Var4.d.postOnAnimation(new n8(n9Var4, 3));
                return;
        }
    }
}
