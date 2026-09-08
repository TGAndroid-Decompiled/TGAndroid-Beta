package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class i60 extends w80 {
    public final m60 L;

    public i60(m60 m60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = m60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        r60 r60Var = this.L.f28420c;
        org.telegram.ui.ActionBar.d3 d3Var = r60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.f3) r60Var).resourcesProvider;
        qc Q = new yc(d3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.f29714r = false;
        Q.k(true);
    }
}
