package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class e50 extends r70 {
    public final i50 M;

    public e50(i50 i50Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.v2 v2Var, boolean z9) {
        super(context, f2Var, v2Var, false, z9);
        this.M = i50Var;
    }

    @Override
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        n50 n50Var = this.M.f34575c;
        org.telegram.ui.ActionBar.l2 l2Var = n50Var.f28627c;
        int i7 = n50.f36253e2;
        cc Q = new hc(l2Var, n50Var.I0).Q(2131624028, 36, spannableStringBuilder);
        Q.f32635r = false;
        Q.k(true);
    }
}
