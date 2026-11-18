package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class o50 extends e80 {
    public final s50 N;

    public o50(s50 s50Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.x2 x2Var, boolean z10) {
        super(context, h2Var, x2Var, false, z10);
        this.N = s50Var;
    }

    @Override
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        x50 x50Var = this.N.f39494c;
        org.telegram.ui.ActionBar.n2 n2Var = x50Var.f30193c;
        int i7 = x50.f41886i2;
        gc Q = new lc(n2Var, x50Var.J0).Q(2131624029, 36, spannableStringBuilder);
        Q.f35469r = false;
        Q.k(true);
    }
}
