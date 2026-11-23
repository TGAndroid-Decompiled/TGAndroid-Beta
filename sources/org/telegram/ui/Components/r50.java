package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class r50 extends g80 {
    public final v50 N;

    public r50(v50 v50Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.w2 w2Var, boolean z10) {
        super(context, g2Var, w2Var, false, z10);
        this.N = v50Var;
    }

    @Override
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        a60 a60Var = this.N.f40685c;
        org.telegram.ui.ActionBar.m2 m2Var = a60Var.f30179c;
        int i7 = a60.f33325i2;
        gc Q = new lc(m2Var, a60Var.J0).Q(2131624029, 36, spannableStringBuilder);
        Q.f35535r = false;
        Q.k(true);
    }
}
