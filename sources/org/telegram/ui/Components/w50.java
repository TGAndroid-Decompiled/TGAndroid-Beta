package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

public final class w50 extends i80 {
    public final a60 H;

    public w50(a60 a60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, n2Var, e3Var, false, z10);
        this.H = a60Var;
    }

    @Override
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        f60 f60Var = this.H.f26642c;
        ec ecVarQ = new mc(f60Var.container, ((org.telegram.ui.ActionBar.e3) f60Var).resourcesProvider).Q(i10, 36, spannableStringBuilder);
        ecVarQ.f28028r = false;
        ecVarQ.k(true);
    }
}
