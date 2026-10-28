package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b70 extends nm0 {
    public int f26754f3;
    public final o70 f26755g3;

    public b70(o70 o70Var, Context context) {
        super(context, null);
        this.f26755g3 = o70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        o70 o70Var = this.f26755g3;
        b70 b70Var = o70Var.V;
        if (this.f26754f3 != View.MeasureSpec.getSize(i11)) {
            this.f26754f3 = View.MeasureSpec.getSize(i11);
            o70Var.f31208a0 = true;
            b70Var.setPadding(0, 0, 0, 0);
            o70Var.f31208a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f26754f3;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.f26754f3 - measuredHeight;
            }
            o70Var.f31208a0 = true;
            b70Var.setPadding(0, i13, 0, 0);
            o70Var.f31208a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26755g3.f31208a0) {
            return;
        }
        super.requestLayout();
    }
}
