package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class r60 extends e90 {
    public final v60 L;

    public r60(v60 v60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = v60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.e6 e6Var;
        a70 a70Var = this.L.f28942c;
        org.telegram.ui.ActionBar.d3 d3Var = a70Var.container;
        e6Var = ((org.telegram.ui.ActionBar.f3) a70Var).resourcesProvider;
        qc Q = new xc(d3Var, e6Var).Q(i10, 36, spannableStringBuilder);
        Q.f27558r = false;
        Q.k(true);
    }
}
