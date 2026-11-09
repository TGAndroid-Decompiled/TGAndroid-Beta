package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class cx extends r41 {
    public cx(Context context, int i7, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i7, -1, false, v10Var, a20Var, null, g6Var, -1, 0);
        this.f37403y2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        int i7;
        if (view != null) {
            float L = org.telegram.messenger.g0.L(92.0f);
            float width = getWidth() - L;
            float x10 = view.getX();
            float width2 = view.getWidth() + x10;
            if (x10 < L) {
                i7 = (int) (x10 - L);
            } else if (width2 > width) {
                i7 = (int) (width2 - width);
            } else {
                i7 = 0;
            }
            if (i7 != 0) {
                org.telegram.messenger.g0.J(this, new org.telegram.ui.f10(this, view, i7, 20));
            }
        }
    }
}
