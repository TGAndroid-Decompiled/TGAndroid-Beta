package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class o3 extends FrameLayout {
    public final org.telegram.ui.Cells.a2[] f29372a;

    public o3(Activity activity, org.telegram.ui.Cells.a2[] a2VarArr) {
        super(activity);
        this.f29372a = a2VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.a2[] a2VarArr = this.f29372a;
        if (a2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), a2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
