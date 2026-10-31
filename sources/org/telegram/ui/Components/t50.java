package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class t50 extends j80 {
    public final x50 M;

    public t50(x50 x50Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.z2 z2Var, boolean z10) {
        super(context, k2Var, z2Var, false, z10);
        this.M = x50Var;
    }

    @Override
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        c60 c60Var = this.M.f32356c;
        org.telegram.ui.ActionBar.p2 p2Var = c60Var.f21589c;
        int i10 = c60.f24989e2;
        wb Q = new cc(p2Var, c60Var.I0).Q(2131624027, 36, spannableStringBuilder);
        Q.f32143r = false;
        Q.k(true);
    }
}
