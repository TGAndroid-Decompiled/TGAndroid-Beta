package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g70 extends rm0 {
    public int V2;
    public final t70 W2;

    public g70(t70 t70Var, Context context) {
        super(context, null);
        this.W2 = t70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        t70 t70Var = this.W2;
        g70 g70Var = t70Var.V;
        if (this.V2 != View.MeasureSpec.getSize(i11)) {
            this.V2 = View.MeasureSpec.getSize(i11);
            t70Var.f31134a0 = true;
            g70Var.setPadding(0, 0, 0, 0);
            t70Var.f31134a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.V2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.V2 - measuredHeight;
            }
            t70Var.f31134a0 = true;
            g70Var.setPadding(0, i13, 0, 0);
            t70Var.f31134a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.W2.f31134a0) {
            return;
        }
        super.requestLayout();
    }
}
