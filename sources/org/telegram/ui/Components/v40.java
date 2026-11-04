package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class v40 extends tj0 {
    public int f38991f3;
    public final i50 f38992g3;

    public v40(i50 i50Var, Context context) {
        super(context, null);
        this.f38992g3 = i50Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        i50 i50Var = this.f38992g3;
        v40 v40Var = i50Var.N1;
        if (this.f38991f3 != View.MeasureSpec.getSize(i10)) {
            this.f38991f3 = View.MeasureSpec.getSize(i10);
            i50Var.S1 = true;
            v40Var.setPadding(0, 0, 0, 0);
            i50Var.S1 = false;
            measure(i3, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f38991f3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f38991f3 - measuredHeight;
            }
            i50Var.S1 = true;
            v40Var.setPadding(0, i12, 0, 0);
            i50Var.S1 = false;
            measure(i3, View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f38992g3.S1) {
            return;
        }
        super.requestLayout();
    }
}
