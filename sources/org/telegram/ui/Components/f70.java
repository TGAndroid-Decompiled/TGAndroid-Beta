package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class f70 extends s90 {
    public final j70 M;

    public f70(j70 j70Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.k3 k3Var, boolean z10) {
        super(context, r2Var, k3Var, false, z10);
        this.M = j70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.u6 u6Var;
        o70 o70Var = this.M.f29532c;
        org.telegram.ui.ActionBar.h3 h3Var = o70Var.container;
        u6Var = ((org.telegram.ui.ActionBar.k3) o70Var).resourcesProvider;
        qc R = new wc(h3Var, u6Var).R(i10, 36, spannableStringBuilder);
        R.f31870s = false;
        R.k(true);
    }
}
