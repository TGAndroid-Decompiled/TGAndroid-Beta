package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class j8 implements Runnable {

    public final int f39280a;

    public final j9 f39281b;

    public j8(j9 j9Var, int i10) {
        this.f39280a = i10;
        this.f39281b = j9Var;
    }

    @Override
    public final void run() {
        switch (this.f39280a) {
            case 0:
                j9 j9Var = this.f39281b;
                j9Var.f0();
                j9Var.i0();
                break;
            case 1:
                j9 j9Var2 = this.f39281b;
                j9Var2.n0(false);
                org.telegram.ui.Components.ec ecVarI = (j9Var2.f39300w ? org.telegram.ui.Components.mc.X() : org.telegram.ui.Components.mc.a0(j9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new j8(j9Var2, 5));
                ecVarI.f28020j = 5000;
                ecVarI.j();
                break;
            case 2:
                this.f39281b.p0(true);
                break;
            case 3:
                j9 j9Var3 = this.f39281b;
                j9Var3.h0();
                j9Var3.f0();
                break;
            case 4:
                this.f39281b.n0(false);
                break;
            case 5:
                this.f39281b.n0(true);
                break;
            default:
                j9 j9Var4 = this.f39281b;
                j9Var4.d.postOnAnimation(new j8(j9Var4, 3));
                break;
        }
    }
}
