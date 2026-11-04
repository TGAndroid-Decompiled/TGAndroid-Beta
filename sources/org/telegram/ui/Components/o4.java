package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class o4 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f36690a;

    public o4(Context context, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(context);
        this.f36690a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f36690a;
        if (c2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
