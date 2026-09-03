package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class i3 extends FrameLayout {
    public final org.telegram.ui.Cells.z1[] f27700a;

    public i3(Activity activity, org.telegram.ui.Cells.z1[] z1VarArr) {
        super(activity);
        this.f27700a = z1VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.z1[] z1VarArr = this.f27700a;
        if (z1VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), z1VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
