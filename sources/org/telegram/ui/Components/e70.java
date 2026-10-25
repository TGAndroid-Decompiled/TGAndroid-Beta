package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class e70 extends r90 {
    public final i70 M;

    public e70(i70 i70Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.k3 k3Var, boolean z10) {
        super(context, r2Var, k3Var, false, z10);
        this.M = i70Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.u6 u6Var;
        n70 n70Var = this.M.f29204c;
        org.telegram.ui.ActionBar.h3 h3Var = n70Var.container;
        u6Var = ((org.telegram.ui.ActionBar.k3) n70Var).resourcesProvider;
        qc R = new wc(h3Var, u6Var).R(i10, 36, spannableStringBuilder);
        R.f31896s = false;
        R.k(true);
    }
}
