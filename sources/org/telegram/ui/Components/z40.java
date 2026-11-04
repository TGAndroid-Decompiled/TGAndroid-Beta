package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class z40 extends m70 {
    public final d50 N;

    public z40(d50 d50Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.t2 t2Var, boolean z10) {
        super(context, d2Var, t2Var, false, z10);
        this.N = d50Var;
    }

    @Override
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        i50 i50Var = this.N.f32935c;
        org.telegram.ui.ActionBar.j2 j2Var = i50Var.f28589c;
        int i3 = i50.f34598f2;
        ac Q = new fc(j2Var, i50Var.J0).Q(2131624028, 36, spannableStringBuilder);
        Q.f31800r = false;
        Q.k(true);
    }
}
