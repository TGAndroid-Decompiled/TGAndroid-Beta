package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class u60 extends h90 {
    public final y60 L;

    public u60(y60 y60Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = y60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        d70 d70Var = this.L.f30574c;
        org.telegram.ui.ActionBar.c3 c3Var = d70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.e3) d70Var).resourcesProvider;
        qc Q = new xc(c3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.f27643r = false;
        Q.k(true);
    }
}
