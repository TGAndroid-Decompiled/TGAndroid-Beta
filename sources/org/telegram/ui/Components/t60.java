package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class t60 extends g90 {
    public final x60 L;

    public t60(x60 x60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = x60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        c70 c70Var = this.L.f30228c;
        org.telegram.ui.ActionBar.d3 d3Var = c70Var.container;
        f6Var = ((org.telegram.ui.ActionBar.f3) c70Var).resourcesProvider;
        pc Q = new xc(d3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.f27319r = false;
        Q.k(true);
    }
}
