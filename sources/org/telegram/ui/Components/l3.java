package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class l3 extends FrameLayout {
    public final org.telegram.ui.Cells.y1[] f30219a;

    public l3(Activity activity, org.telegram.ui.Cells.y1[] y1VarArr) {
        super(activity);
        this.f30219a = y1VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.y1[] y1VarArr = this.f30219a;
        if (y1VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), y1VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
