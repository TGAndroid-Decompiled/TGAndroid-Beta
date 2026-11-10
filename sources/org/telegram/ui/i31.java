package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i31 extends org.telegram.ui.Components.w31 {
    public static final int f46475b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        ((j31) view).set(x31Var.f40169z);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.x31 x31Var, org.telegram.ui.Components.x31 x31Var2) {
        if (x31Var.f40169z == x31Var2.f40169z) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new j31(context, h6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.x31 x31Var, org.telegram.ui.Components.x31 x31Var2) {
        if (x31Var.d == x31Var2.d) {
            return true;
        }
        return false;
    }
}
