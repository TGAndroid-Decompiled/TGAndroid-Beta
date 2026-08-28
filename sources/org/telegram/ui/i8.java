package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i8 implements Runnable {
    public final int f39056a;
    public final i9 f39057b;

    public i8(i9 i9Var, int i9) {
        this.f39056a = i9;
        this.f39057b = i9Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.oc a02;
        switch (this.f39056a) {
            case 0:
                i9 i9Var = this.f39057b;
                i9Var.e0();
                i9Var.h0();
                return;
            case 1:
                i9 i9Var2 = this.f39057b;
                i9Var2.m0(false);
                if (i9Var2.f39078w) {
                    a02 = org.telegram.ui.Components.oc.X();
                } else {
                    a02 = org.telegram.ui.Components.oc.a0(i9Var2);
                }
                org.telegram.ui.Components.gc I = a02.I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new i8(i9Var2, 5));
                I.f28737j = 5000;
                I.j();
                return;
            case 2:
                this.f39057b.o0(true);
                return;
            case 3:
                i9 i9Var3 = this.f39057b;
                i9Var3.g0();
                i9Var3.e0();
                return;
            case 4:
                this.f39057b.m0(false);
                return;
            case 5:
                this.f39057b.m0(true);
                return;
            default:
                i9 i9Var4 = this.f39057b;
                i9Var4.d.postOnAnimation(new i8(i9Var4, 3));
                return;
        }
    }
}
