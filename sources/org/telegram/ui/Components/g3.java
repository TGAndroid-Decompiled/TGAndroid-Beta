package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class g3 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f33813a;

    public g3(Activity activity, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(activity);
        this.f33813a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f33813a;
        if (c2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
