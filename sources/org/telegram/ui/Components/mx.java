package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class mx extends e51 {
    public mx(Context context, int i7, org.telegram.messenger.q10 q10Var, org.telegram.messenger.v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, -1, false, q10Var, v10Var, null, i6Var, -1, 0);
        this.f34096z2 = true;
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
                org.telegram.messenger.g0.J(this, new h01(this, view, i7, 24));
            }
        }
    }
}
