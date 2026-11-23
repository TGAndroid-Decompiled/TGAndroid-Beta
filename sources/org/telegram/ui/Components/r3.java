package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class r3 extends FrameLayout {
    public final org.telegram.ui.Cells.d2[] f39014a;

    public r3(Activity activity, org.telegram.ui.Cells.d2[] d2VarArr) {
        super(activity);
        this.f39014a = d2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.d2[] d2VarArr = this.f39014a;
        if (d2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), d2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
