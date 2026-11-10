package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class z40 extends pj0 {
    public int f40851e3;
    public final m50 f40852f3;

    public z40(m50 m50Var, Context context) {
        super(context, null);
        this.f40852f3 = m50Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        m50 m50Var = this.f40852f3;
        z40 z40Var = m50Var.P1;
        if (this.f40851e3 != View.MeasureSpec.getSize(i10)) {
            this.f40851e3 = View.MeasureSpec.getSize(i10);
            m50Var.U1 = true;
            z40Var.setPadding(0, 0, 0, 0);
            m50Var.U1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f40851e3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f40851e3 - measuredHeight;
            }
            m50Var.U1 = true;
            z40Var.setPadding(0, i12, 0, 0);
            m50Var.U1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f40852f3.U1) {
            return;
        }
        super.requestLayout();
    }
}
