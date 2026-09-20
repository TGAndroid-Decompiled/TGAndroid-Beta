package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class q60 extends d90 {
    public final u60 L;

    public q60(u60 u60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = u60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        z60 z60Var = this.L.f28601c;
        org.telegram.ui.ActionBar.d3 d3Var = z60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.f3) z60Var).resourcesProvider;
        pc Q = new xc(d3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.f27260r = false;
        Q.k(true);
    }
}
