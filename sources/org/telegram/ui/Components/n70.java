package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class n70 extends ba0 {
    public final r70 L;

    public n70(r70 r70Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = r70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.c6 c6Var;
        w70 w70Var = this.L.f30068c;
        org.telegram.ui.ActionBar.c3 c3Var = w70Var.container;
        c6Var = ((org.telegram.ui.ActionBar.e3) w70Var).resourcesProvider;
        sc Q = new zc(c3Var, c6Var).Q(i10, 36, spannableStringBuilder);
        Q.f30544r = false;
        Q.k(true);
    }
}
