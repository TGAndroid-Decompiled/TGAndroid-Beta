package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class g70 extends w90 {
    public final k70 L;

    public g70(k70 k70Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = k70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.c6 c6Var;
        p70 p70Var = this.L.f26233c;
        org.telegram.ui.ActionBar.c3 c3Var = p70Var.container;
        c6Var = ((org.telegram.ui.ActionBar.e3) p70Var).resourcesProvider;
        sc Q = new zc(c3Var, c6Var).Q(i10, 36, spannableStringBuilder);
        Q.f28813r = false;
        Q.k(true);
    }
}
