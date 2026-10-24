package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class b70 extends p90 {
    public final f70 M;

    public b70(f70 f70Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.h3 h3Var, boolean z10) {
        super(context, o2Var, h3Var, false, z10);
        this.M = f70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.g6 g6Var;
        k70 k70Var = this.M.f26217c;
        org.telegram.ui.ActionBar.e3 e3Var = k70Var.container;
        g6Var = ((org.telegram.ui.ActionBar.h3) k70Var).resourcesProvider;
        oc Q = new vc(e3Var, g6Var).Q(i10, 36, spannableStringBuilder);
        Q.f29211r = false;
        Q.k(true);
    }
}
