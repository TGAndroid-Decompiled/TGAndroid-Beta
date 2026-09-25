package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p60 extends wl0 {
    public int X2;
    public final c70 Y2;

    public p60(c70 c70Var, Context context) {
        super(context, null);
        this.Y2 = c70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c70 c70Var = this.Y2;
        p60 p60Var = c70Var.V;
        if (this.X2 != View.MeasureSpec.getSize(i11)) {
            this.X2 = View.MeasureSpec.getSize(i11);
            c70Var.f23255a0 = true;
            p60Var.setPadding(0, 0, 0, 0);
            c70Var.f23255a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.X2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.X2 - measuredHeight;
            }
            c70Var.f23255a0 = true;
            p60Var.setPadding(0, i13, 0, 0);
            c70Var.f23255a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2.f23255a0) {
            return;
        }
        super.requestLayout();
    }
}
