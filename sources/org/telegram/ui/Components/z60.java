package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z60 extends mm0 {
    public int Y2;
    public final m70 Z2;

    public z60(m70 m70Var, Context context) {
        super(context, null);
        this.Z2 = m70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        m70 m70Var = this.Z2;
        z60 z60Var = m70Var.V;
        if (this.Y2 != View.MeasureSpec.getSize(i11)) {
            this.Y2 = View.MeasureSpec.getSize(i11);
            m70Var.f28575a0 = true;
            z60Var.setPadding(0, 0, 0, 0);
            m70Var.f28575a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.Y2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.Y2 - measuredHeight;
            }
            m70Var.f28575a0 = true;
            z60Var.setPadding(0, i13, 0, 0);
            m70Var.f28575a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.Z2.f28575a0) {
            return;
        }
        super.requestLayout();
    }
}
