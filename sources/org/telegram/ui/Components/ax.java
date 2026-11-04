package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ax extends l41 {
    public ax(Context context, int i3, org.telegram.messenger.n10 n10Var, org.telegram.messenger.s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, -1, false, n10Var, s10Var, null, e6Var, -1, 0);
        this.f38482z2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        int i3;
        if (view != null) {
            float L = org.telegram.messenger.g0.L(92.0f);
            float width = getWidth() - L;
            float x10 = view.getX();
            float width2 = view.getWidth() + x10;
            if (x10 < L) {
                i3 = (int) (x10 - L);
            } else if (width2 > width) {
                i3 = (int) (width2 - width);
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                org.telegram.messenger.g0.J(this, new org.telegram.ui.rw(this, view, i3, 23));
            }
        }
    }
}
