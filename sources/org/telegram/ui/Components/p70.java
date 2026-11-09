package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class p70 extends z8 {
    public final bi.s1 f36938e;

    public p70(bi.s1 s1Var, Context context) {
        super(context, false);
        this.f36938e = s1Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int e10;
        int min = Math.min(3, ((r70) this.f36938e.d).f37573x);
        if (min == 0) {
            e10 = 0;
        } else {
            e10 = com.google.android.recaptcha.internal.a.e(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(e10), 1073741824), i10);
    }
}
