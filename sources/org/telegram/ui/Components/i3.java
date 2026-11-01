package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class i3 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f26992a;

    public i3(Activity activity, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(activity);
        this.f26992a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f26992a;
        if (c2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), c2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
