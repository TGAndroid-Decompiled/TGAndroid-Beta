package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class k70 extends x90 {
    public final o70 L;

    public k70(o70 o70Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = o70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        t70 t70Var = this.L.f29405c;
        org.telegram.ui.ActionBar.c3 c3Var = t70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.e3) t70Var).resourcesProvider;
        sc Q = new ad(c3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.f30841r = false;
        Q.k(true);
    }
}
