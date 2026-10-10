package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class l70 extends y90 {
    public final p70 L;

    public l70(p70 p70Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = p70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.e6 e6Var;
        u70 u70Var = this.L.f29713c;
        org.telegram.ui.ActionBar.d3 d3Var = u70Var.container;
        e6Var = ((org.telegram.ui.ActionBar.f3) u70Var).resourcesProvider;
        tc Q = new ad(d3Var, e6Var).Q(i10, 36, spannableStringBuilder);
        Q.f31104r = false;
        Q.k(true);
    }
}
