package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class l60 extends y80 {
    public final p60 I;

    public l60(p60 p60Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.h3 h3Var, boolean z4) {
        super(context, p2Var, h3Var, false, z4);
        this.I = p60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.g6 g6Var;
        u60 u60Var = this.I.f29975c;
        org.telegram.ui.ActionBar.f3 f3Var = u60Var.container;
        g6Var = ((org.telegram.ui.ActionBar.h3) u60Var).resourcesProvider;
        ic Q = new qc(f3Var, g6Var).Q(i10, 36, spannableStringBuilder);
        Q.f27753r = false;
        Q.k(true);
    }
}
