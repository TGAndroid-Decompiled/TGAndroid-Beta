package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class e3 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f25633a;

    public e3(Activity activity, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(activity);
        this.f25633a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f25633a;
        if (c2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.i0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
