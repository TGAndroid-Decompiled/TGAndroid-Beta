package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a60 extends jl0 {
    public int T2;
    public final n60 U2;

    public a60(n60 n60Var, Context context) {
        super(context, null);
        this.U2 = n60Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n60 n60Var = this.U2;
        a60 a60Var = n60Var.R;
        if (this.T2 != View.MeasureSpec.getSize(i11)) {
            this.T2 = View.MeasureSpec.getSize(i11);
            n60Var.W = true;
            a60Var.setPadding(0, 0, 0, 0);
            n60Var.W = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.T2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.T2 - measuredHeight;
            }
            n60Var.W = true;
            a60Var.setPadding(0, i13, 0, 0);
            n60Var.W = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.U2.W) {
            return;
        }
        super.requestLayout();
    }
}
