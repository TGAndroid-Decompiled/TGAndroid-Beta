package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h8 implements Runnable {
    public final int f38339a;
    public final i9 f38340b;

    public h8(i9 i9Var, int i10) {
        this.f38339a = i10;
        this.f38340b = i9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ad a02;
        switch (this.f38339a) {
            case 0:
                i9 i9Var = this.f38340b;
                i9Var.f0();
                i9Var.i0();
                return;
            case 1:
                i9 i9Var2 = this.f38340b;
                i9Var2.n0(false);
                if (i9Var2.f38660w) {
                    a02 = org.telegram.ui.Components.ad.X();
                } else {
                    a02 = org.telegram.ui.Components.ad.a0(i9Var2);
                }
                org.telegram.ui.Components.sc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new h8(i9Var2, 5));
                I.f30833j = 5000;
                I.j();
                return;
            case 2:
                this.f38340b.p0(true);
                return;
            case 3:
                i9 i9Var3 = this.f38340b;
                i9Var3.h0();
                i9Var3.f0();
                return;
            case 4:
                this.f38340b.n0(false);
                return;
            case 5:
                this.f38340b.n0(true);
                return;
            default:
                i9 i9Var4 = this.f38340b;
                i9Var4.d.postOnAnimation(new h8(i9Var4, 3));
                return;
        }
    }
}
