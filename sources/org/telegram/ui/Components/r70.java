package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class r70 extends w8 {
    public final di.e1 f38892e;

    public r70(di.e1 e1Var, Context context) {
        super(context, false);
        this.f38892e = e1Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int v;
        int min = Math.min(3, ((t70) this.f38892e.d).f39583x);
        if (min == 0) {
            v = 0;
        } else {
            v = com.google.android.gms.internal.vision.e2.v(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(v), 1073741824), i10);
    }
}
