package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class c70 extends q90 {
    public final g70 L;

    public c70(g70 g70Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = g70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        l70 l70Var = this.L.f26492c;
        org.telegram.ui.ActionBar.d3 d3Var = l70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.f3) l70Var).resourcesProvider;
        qc Q = new xc(d3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.f29647r = false;
        Q.k(true);
    }
}
