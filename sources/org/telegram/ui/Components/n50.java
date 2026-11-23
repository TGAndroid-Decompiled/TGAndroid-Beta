package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class n50 extends ek0 {
    public int f37785f3;
    public final a60 f37786g3;

    public n50(a60 a60Var, Context context) {
        super(context, null);
        this.f37786g3 = a60Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        a60 a60Var = this.f37786g3;
        n50 n50Var = a60Var.Q1;
        if (this.f37785f3 != View.MeasureSpec.getSize(i10)) {
            this.f37785f3 = View.MeasureSpec.getSize(i10);
            a60Var.V1 = true;
            n50Var.setPadding(0, 0, 0, 0);
            a60Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f37785f3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f37785f3 - measuredHeight;
            }
            a60Var.V1 = true;
            n50Var.setPadding(0, i12, 0, 0);
            a60Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f37786g3.V1) {
            return;
        }
        super.requestLayout();
    }
}
