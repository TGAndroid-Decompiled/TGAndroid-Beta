package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class i60 extends v80 {
    public final m60 L;

    public i60(m60 m60Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g3 g3Var, boolean z10) {
        super(context, o2Var, g3Var, false, z10);
        this.L = m60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        r60 r60Var = this.L.f26088c;
        org.telegram.ui.ActionBar.e3 e3Var = r60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.g3) r60Var).resourcesProvider;
        oc Q = new vc(e3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.f26710r = false;
        Q.k(true);
    }
}
