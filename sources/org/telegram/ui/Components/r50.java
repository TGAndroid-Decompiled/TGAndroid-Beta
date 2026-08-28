package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class r50 extends e80 {
    public final v50 H;

    public r50(v50 v50Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, o2Var, f3Var, false, z10);
        this.H = v50Var;
    }

    @Override
    public final void e(int i9, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.b6 b6Var;
        a60 a60Var = this.H.f33265c;
        org.telegram.ui.ActionBar.d3 d3Var = a60Var.container;
        b6Var = ((org.telegram.ui.ActionBar.f3) a60Var).resourcesProvider;
        gc Q = new oc(d3Var, b6Var).Q(i9, 36, spannableStringBuilder);
        Q.f28745r = false;
        Q.k(true);
    }
}
