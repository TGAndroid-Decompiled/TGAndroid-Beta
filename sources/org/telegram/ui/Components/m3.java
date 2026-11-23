package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class m3 extends FrameLayout {
    public final org.telegram.ui.Cells.d2[] f37357a;

    public m3(Activity activity, org.telegram.ui.Cells.d2[] d2VarArr) {
        super(activity);
        this.f37357a = d2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.d2[] d2VarArr = this.f37357a;
        if (d2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + d2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
