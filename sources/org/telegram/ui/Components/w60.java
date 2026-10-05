package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class w60 extends j90 {
    public final a70 L;

    public w60(a70 a70Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = a70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        f70 f70Var = this.L.f24510c;
        org.telegram.ui.ActionBar.d3 d3Var = f70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.f3) f70Var).resourcesProvider;
        rc Q = new yc(d3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.f30435r = false;
        Q.k(true);
    }
}
