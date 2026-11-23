package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class x4 extends FrameLayout {
    public final org.telegram.ui.Cells.d2[] f41972a;

    public x4(Context context, org.telegram.ui.Cells.d2[] d2VarArr) {
        super(context);
        this.f41972a = d2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.d2[] d2VarArr = this.f41972a;
        if (d2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + d2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
