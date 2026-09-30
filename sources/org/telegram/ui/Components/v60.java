package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class v60 extends i90 {
    public final z60 L;

    public v60(z60 z60Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = z60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        e70 e70Var = this.L.f30827c;
        org.telegram.ui.ActionBar.c3 c3Var = e70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.e3) e70Var).resourcesProvider;
        qc Q = new yc(c3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.f27649r = false;
        Q.k(true);
    }
}
