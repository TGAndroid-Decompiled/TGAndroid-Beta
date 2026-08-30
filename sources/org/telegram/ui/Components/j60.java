package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class j60 extends x80 {
    public final n60 I;

    public j60(n60 n60Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g3 g3Var, boolean z4) {
        super(context, p2Var, g3Var, false, z4);
        this.I = n60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        s60 s60Var = this.I.f27204c;
        org.telegram.ui.ActionBar.e3 e3Var = s60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.g3) s60Var).resourcesProvider;
        ic Q = new qc(e3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.f25680r = false;
        Q.k(true);
    }
}
