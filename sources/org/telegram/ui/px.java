package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class px extends org.telegram.ui.Components.k41 {
    public static final int f51032b = 0;

    static {
        org.telegram.ui.Components.k41.h(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        qx qxVar = (qx) view;
        qxVar.f51354n = (org.telegram.messenger.x10) l41Var.H;
        qxVar.f51355r = l41Var;
        qxVar.b(l41Var.A, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new qx(context, i6Var);
    }
}
