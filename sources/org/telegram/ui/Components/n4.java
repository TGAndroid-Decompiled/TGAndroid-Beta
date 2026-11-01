package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class n4 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f28663a;

    public n4(Context context, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(context);
        this.f28663a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f28663a;
        if (c2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.i0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
