package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class r60 extends f90 {
    public final v60 L;

    public r60(v60 v60Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.h3 h3Var, boolean z10) {
        super(context, p2Var, h3Var, false, z10);
        this.L = v60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        a70 a70Var = this.L.f27846c;
        org.telegram.ui.ActionBar.f3 f3Var = a70Var.container;
        f6Var = ((org.telegram.ui.ActionBar.h3) a70Var).resourcesProvider;
        pc Q = new wc(f3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.f26089r = false;
        Q.k(true);
    }
}
