package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class q4 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f37134a;

    public q4(Context context, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(context);
        this.f37134a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f37134a;
        if (c2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
