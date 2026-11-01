package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class qx extends v51 {
    public qx(Context context, int i10, org.telegram.messenger.k20 k20Var, org.telegram.messenger.p20 p20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, -1, false, k20Var, p20Var, null, p6Var, -1, 0);
        this.f31030y2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        int i10;
        if (view != null) {
            float L = org.telegram.messenger.i0.L(92.0f);
            float width = getWidth() - L;
            float x10 = view.getX();
            float width2 = view.getWidth() + x10;
            if (x10 < L) {
                i10 = (int) (x10 - L);
            } else if (width2 > width) {
                i10 = (int) (width2 - width);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                org.telegram.messenger.i0.J(this, new ag.o0(this, view, i10, 4));
            }
        }
    }
}
