package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q60 extends xl0 {
    public int X2;
    public final d70 Y2;

    public q60(d70 d70Var, Context context) {
        super(context, null);
        this.Y2 = d70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d70 d70Var = this.Y2;
        q60 q60Var = d70Var.V;
        if (this.X2 != View.MeasureSpec.getSize(i11)) {
            this.X2 = View.MeasureSpec.getSize(i11);
            d70Var.f23592a0 = true;
            q60Var.setPadding(0, 0, 0, 0);
            d70Var.f23592a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.X2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.X2 - measuredHeight;
            }
            d70Var.f23592a0 = true;
            q60Var.setPadding(0, i13, 0, 0);
            d70Var.f23592a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2.f23592a0) {
            return;
        }
        super.requestLayout();
    }
}
