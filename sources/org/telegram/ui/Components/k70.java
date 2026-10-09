package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class k70 extends x90 {
    public final o70 L;

    public k70(o70 o70Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = o70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.e6 e6Var;
        t70 t70Var = this.L.f29404c;
        org.telegram.ui.ActionBar.d3 d3Var = t70Var.container;
        e6Var = ((org.telegram.ui.ActionBar.f3) t70Var).resourcesProvider;
        tc Q = new ad(d3Var, e6Var).Q(i10, 36, spannableStringBuilder);
        Q.f31138r = false;
        Q.k(true);
    }
}
