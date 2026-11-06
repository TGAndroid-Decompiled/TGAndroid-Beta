package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class d50 extends q70 {
    public final h50 M;

    public d50(h50 h50Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.v2 v2Var, boolean z9) {
        super(context, f2Var, v2Var, false, z9);
        this.M = h50Var;
    }

    @Override
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        m50 m50Var = this.M.f34167c;
        org.telegram.ui.ActionBar.l2 l2Var = m50Var.f28618c;
        int i7 = m50.f35856e2;
        cc Q = new hc(l2Var, m50Var.I0).Q(2131624028, 36, spannableStringBuilder);
        Q.f32535r = false;
        Q.k(true);
    }
}
