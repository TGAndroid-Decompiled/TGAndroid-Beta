package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class px extends org.telegram.ui.Components.n41 {
    public static final int f50934b = 0;

    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        qx qxVar = (qx) view;
        qxVar.f51338n = (org.telegram.messenger.y10) o41Var.H;
        qxVar.f51339r = o41Var;
        qxVar.b(o41Var.A, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new qx(context, h6Var);
    }
}
