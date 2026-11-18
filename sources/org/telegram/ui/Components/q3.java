package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class q3 extends FrameLayout {
    public final org.telegram.ui.Cells.d2[] f38687a;

    public q3(Activity activity, org.telegram.ui.Cells.d2[] d2VarArr) {
        super(activity);
        this.f38687a = d2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.d2[] d2VarArr = this.f38687a;
        if (d2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), d2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
