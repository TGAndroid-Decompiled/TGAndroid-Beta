package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class v60 extends i90 {
    public final z60 L;

    public v60(z60 z60Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g3 g3Var, boolean z10) {
        super(context, o2Var, g3Var, false, z10);
        this.L = z60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.e6 e6Var;
        e70 e70Var = this.L.f30861c;
        org.telegram.ui.ActionBar.e3 e3Var = e70Var.container;
        e6Var = ((org.telegram.ui.ActionBar.g3) e70Var).resourcesProvider;
        qc Q = new xc(e3Var, e6Var).Q(i10, 36, spannableStringBuilder);
        Q.f27699r = false;
        Q.k(true);
    }
}
