package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class a50 extends qj0 {
    public int f31709e3;
    public final n50 f31710f3;

    public a50(n50 n50Var, Context context) {
        super(context, null);
        this.f31710f3 = n50Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        n50 n50Var = this.f31710f3;
        a50 a50Var = n50Var.M1;
        if (this.f31709e3 != View.MeasureSpec.getSize(i10)) {
            this.f31709e3 = View.MeasureSpec.getSize(i10);
            n50Var.R1 = true;
            a50Var.setPadding(0, 0, 0, 0);
            n50Var.R1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f31709e3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f31709e3 - measuredHeight;
            }
            n50Var.R1 = true;
            a50Var.setPadding(0, i12, 0, 0);
            n50Var.R1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f31710f3.R1) {
            return;
        }
        super.requestLayout();
    }
}
