package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class g50 extends t70 {
    public final k50 N;

    public g50(k50 k50Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.u2 u2Var, boolean z10) {
        super(context, e2Var, u2Var, false, z10);
        this.N = k50Var;
    }

    @Override
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        p50 p50Var = this.N.f36288c;
        org.telegram.ui.ActionBar.k2 k2Var = p50Var.f29685c;
        int i7 = p50.f38206i2;
        xb Q = new cc(k2Var, p50Var.J0).Q(2131624029, 36, spannableStringBuilder);
        Q.f41651r = false;
        Q.k(true);
    }
}
