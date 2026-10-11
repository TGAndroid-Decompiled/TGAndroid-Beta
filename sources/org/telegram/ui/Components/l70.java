package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class l70 extends y90 {
    public final p70 L;

    public l70(p70 p70Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = p70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        u70 u70Var = this.L.f29637c;
        org.telegram.ui.ActionBar.c3 c3Var = u70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.e3) u70Var).resourcesProvider;
        sc Q = new ad(c3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.f30719r = false;
        Q.k(true);
    }
}
