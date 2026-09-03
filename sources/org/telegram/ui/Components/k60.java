package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class k60 extends x80 {
    public final o60 I;

    public k60(o60 o60Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g3 g3Var, boolean z4) {
        super(context, p2Var, g3Var, false, z4);
        this.I = o60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        t60 t60Var = this.I.f27469c;
        org.telegram.ui.ActionBar.e3 e3Var = t60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.g3) t60Var).resourcesProvider;
        ic Q = new qc(e3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.f25679r = false;
        Q.k(true);
    }
}
