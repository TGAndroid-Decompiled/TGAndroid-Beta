package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class e3 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f33277a;

    public e3(Activity activity, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(activity);
        this.f33277a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f33277a;
        if (c2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
