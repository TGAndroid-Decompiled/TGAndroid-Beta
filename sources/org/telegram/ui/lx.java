package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class lx extends org.telegram.ui.Components.v31 {
    public static final int f47599b = 0;

    static {
        org.telegram.ui.Components.v31.h(new org.telegram.ui.Components.v31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.w31 w31Var, boolean z9, org.telegram.ui.Components.k41 k41Var, org.telegram.ui.Components.p41 p41Var) {
        mx mxVar = (mx) view;
        mxVar.f47900n = (org.telegram.messenger.c20) w31Var.G;
        mxVar.f47901r = w31Var;
        mxVar.b(w31Var.f39843z, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new mx(context, f6Var);
    }
}
