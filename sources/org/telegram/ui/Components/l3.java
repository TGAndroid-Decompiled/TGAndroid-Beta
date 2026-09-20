package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class l3 extends FrameLayout {
    public final org.telegram.ui.Cells.a2[] f26005a;

    public l3(Activity activity, org.telegram.ui.Cells.a2[] a2VarArr) {
        super(activity);
        this.f26005a = a2VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.a2[] a2VarArr = this.f26005a;
        if (a2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), a2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
