package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x60 extends lm0 {
    public int Y2;
    public final k70 Z2;

    public x60(k70 k70Var, Context context) {
        super(context, null);
        this.Z2 = k70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        k70 k70Var = this.Z2;
        x60 x60Var = k70Var.V;
        if (this.Y2 != View.MeasureSpec.getSize(i11)) {
            this.Y2 = View.MeasureSpec.getSize(i11);
            k70Var.f27909a0 = true;
            x60Var.setPadding(0, 0, 0, 0);
            k70Var.f27909a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.Y2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.Y2 - measuredHeight;
            }
            k70Var.f27909a0 = true;
            x60Var.setPadding(0, i13, 0, 0);
            k70Var.f27909a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.Z2.f27909a0) {
            return;
        }
        super.requestLayout();
    }
}
