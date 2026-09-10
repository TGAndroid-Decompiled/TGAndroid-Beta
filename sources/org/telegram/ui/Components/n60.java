package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n60 extends vl0 {
    public int X2;
    public final a70 Y2;

    public n60(a70 a70Var, Context context) {
        super(context, null);
        this.Y2 = a70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        a70 a70Var = this.Y2;
        n60 n60Var = a70Var.V;
        if (this.X2 != View.MeasureSpec.getSize(i11)) {
            this.X2 = View.MeasureSpec.getSize(i11);
            a70Var.f21397a0 = true;
            n60Var.setPadding(0, 0, 0, 0);
            a70Var.f21397a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.X2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.X2 - measuredHeight;
            }
            a70Var.f21397a0 = true;
            n60Var.setPadding(0, i13, 0, 0);
            a70Var.f21397a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2.f21397a0) {
            return;
        }
        super.requestLayout();
    }
}
