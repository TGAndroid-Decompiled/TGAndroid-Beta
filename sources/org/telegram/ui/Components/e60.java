package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class e60 extends r80 {
    public final i60 H;

    public e60(i60 i60Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, o2Var, f3Var, false, z10);
        this.H = i60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.c6 c6Var;
        n60 n60Var = this.H.f29327c;
        org.telegram.ui.ActionBar.d3 d3Var = n60Var.container;
        c6Var = ((org.telegram.ui.ActionBar.f3) n60Var).resourcesProvider;
        mc Q = new tc(d3Var, c6Var).Q(i10, 36, spannableStringBuilder);
        Q.f30660r = false;
        Q.k(true);
    }
}
