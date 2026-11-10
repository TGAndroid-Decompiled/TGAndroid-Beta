package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f36794a;

    public p4(Context context, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(context);
        this.f36794a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f36794a;
        if (c2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
