package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class lx extends org.telegram.ui.Components.w31 {
    public static final int f47595b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        mx mxVar = (mx) view;
        mxVar.f47899n = (org.telegram.messenger.c20) x31Var.G;
        mxVar.f47900r = x31Var;
        mxVar.b(x31Var.f40193z, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new mx(context, f6Var);
    }
}
