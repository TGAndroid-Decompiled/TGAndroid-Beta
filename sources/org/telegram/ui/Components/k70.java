package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class k70 extends x8 {
    public final ci.l1 f35338e;

    public k70(ci.l1 l1Var, Context context) {
        super(context, false);
        this.f35338e = l1Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int e10;
        int min = Math.min(3, ((m70) this.f35338e.d).f36064x);
        if (min == 0) {
            e10 = 0;
        } else {
            e10 = com.google.android.recaptcha.internal.a.e(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(e10), 1073741824), i10);
    }
}
