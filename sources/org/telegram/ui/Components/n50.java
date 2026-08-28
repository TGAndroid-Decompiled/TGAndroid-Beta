package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n50 extends wk0 {
    public int T2;
    public final a60 U2;

    public n50(a60 a60Var, Context context) {
        super(context, null);
        this.U2 = a60Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        a60 a60Var = this.U2;
        n50 n50Var = a60Var.R;
        if (this.T2 != View.MeasureSpec.getSize(i10)) {
            this.T2 = View.MeasureSpec.getSize(i10);
            a60Var.W = true;
            n50Var.setPadding(0, 0, 0, 0);
            a60Var.W = false;
            measure(i9, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.T2;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < AndroidUtilities.dp(60.0f) + (i11 - measuredHeight)) {
                i12 = this.T2 - measuredHeight;
            }
            a60Var.W = true;
            n50Var.setPadding(0, i12, 0, 0);
            a60Var.W = false;
            measure(i9, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.U2.W) {
            return;
        }
        super.requestLayout();
    }
}
