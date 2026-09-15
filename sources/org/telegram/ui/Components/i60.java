package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class i60 extends v80 {
    public final m60 L;

    public i60(m60 m60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = m60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.e6 e6Var;
        r60 r60Var = this.L.f26107c;
        org.telegram.ui.ActionBar.d3 d3Var = r60Var.container;
        e6Var = ((org.telegram.ui.ActionBar.f3) r60Var).resourcesProvider;
        oc Q = new vc(d3Var, e6Var).Q(i10, 36, spannableStringBuilder);
        Q.f26762r = false;
        Q.k(true);
    }
}
