package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class c50 extends uj0 {
    public int f33509f3;
    public final p50 f33510g3;

    public c50(p50 p50Var, Context context) {
        super(context, null);
        this.f33510g3 = p50Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        p50 p50Var = this.f33510g3;
        c50 c50Var = p50Var.Q1;
        if (this.f33509f3 != View.MeasureSpec.getSize(i10)) {
            this.f33509f3 = View.MeasureSpec.getSize(i10);
            p50Var.V1 = true;
            c50Var.setPadding(0, 0, 0, 0);
            p50Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f33509f3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f33509f3 - measuredHeight;
            }
            p50Var.V1 = true;
            c50Var.setPadding(0, i12, 0, 0);
            p50Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f33510g3.V1) {
            return;
        }
        super.requestLayout();
    }
}
