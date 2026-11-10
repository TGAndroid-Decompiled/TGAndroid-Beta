package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class ox extends org.telegram.ui.Components.w31 {
    public static final int f48589b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        px pxVar = (px) view;
        pxVar.f48856n = (org.telegram.messenger.c20) x31Var.G;
        pxVar.f48857r = x31Var;
        pxVar.b(x31Var.f40169z, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new px(context, h6Var);
    }
}
