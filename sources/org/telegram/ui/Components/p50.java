package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class p50 extends tk0 {
    public int f29291e3;
    public final c60 f29292f3;

    public p50(c60 c60Var, Context context) {
        super(context, null);
        this.f29292f3 = c60Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c60 c60Var = this.f29292f3;
        p50 p50Var = c60Var.M1;
        if (this.f29291e3 != View.MeasureSpec.getSize(i11)) {
            this.f29291e3 = View.MeasureSpec.getSize(i11);
            c60Var.R1 = true;
            p50Var.setPadding(0, 0, 0, 0);
            c60Var.R1 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f29291e3;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < org.telegram.messenger.i0.L(60.0f) + (i12 - measuredHeight)) {
                i13 = this.f29291e3 - measuredHeight;
            }
            c60Var.R1 = true;
            p50Var.setPadding(0, i13, 0, 0);
            c60Var.R1 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29292f3.R1) {
            return;
        }
        super.requestLayout();
    }
}
