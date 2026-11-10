package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class j3 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f34824a;

    public j3(Activity activity, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(activity);
        this.f34824a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f34824a;
        if (c2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), c2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
