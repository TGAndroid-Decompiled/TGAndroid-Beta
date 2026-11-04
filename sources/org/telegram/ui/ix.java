package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class ix extends org.telegram.ui.Components.q31 {
    public static final int f46430b = 0;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        jx jxVar = (jx) view;
        jxVar.f46704n = (org.telegram.messenger.u10) r31Var.G;
        jxVar.f46705r = r31Var;
        jxVar.b(r31Var.f37640z, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new jx(context, e6Var);
    }
}
