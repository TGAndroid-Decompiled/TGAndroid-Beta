package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class k50 extends ek0 {
    public int f36651f3;
    public final x50 f36652g3;

    public k50(x50 x50Var, Context context) {
        super(context, null);
        this.f36652g3 = x50Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        x50 x50Var = this.f36652g3;
        k50 k50Var = x50Var.Q1;
        if (this.f36651f3 != View.MeasureSpec.getSize(i10)) {
            this.f36651f3 = View.MeasureSpec.getSize(i10);
            x50Var.V1 = true;
            k50Var.setPadding(0, 0, 0, 0);
            x50Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f36651f3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f36651f3 - measuredHeight;
            }
            x50Var.V1 = true;
            k50Var.setPadding(0, i12, 0, 0);
            x50Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f36652g3.V1) {
            return;
        }
        super.requestLayout();
    }
}
