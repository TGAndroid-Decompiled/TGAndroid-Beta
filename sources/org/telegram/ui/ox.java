package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class ox extends org.telegram.ui.Components.m41 {
    public static final int f50779b = 0;

    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        px pxVar = (px) view;
        pxVar.f51160n = (org.telegram.messenger.w10) n41Var.H;
        pxVar.f51161r = n41Var;
        pxVar.b(n41Var.A, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new px(context, i6Var);
    }
}
