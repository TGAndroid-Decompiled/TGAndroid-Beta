package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class h3 extends FrameLayout {
    public final org.telegram.ui.Cells.z1[] f28958a;

    public h3(Activity activity, org.telegram.ui.Cells.z1[] z1VarArr) {
        super(activity);
        this.f28958a = z1VarArr;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        org.telegram.ui.Cells.z1[] z1VarArr = this.f28958a;
        if (z1VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), z1VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
