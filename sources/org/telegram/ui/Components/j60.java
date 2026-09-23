package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class j60 extends w80 {
    public final n60 L;

    public j60(n60 n60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = n60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        s60 s60Var = this.L.f26353c;
        org.telegram.ui.ActionBar.d3 d3Var = s60Var.container;
        d6Var = ((org.telegram.ui.ActionBar.f3) s60Var).resourcesProvider;
        qc Q = new xc(d3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.f27314r = false;
        Q.k(true);
    }
}
