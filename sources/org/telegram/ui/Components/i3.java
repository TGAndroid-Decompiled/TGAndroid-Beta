package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
public final class i3 extends FrameLayout {
    public final org.telegram.ui.Cells.c2[] f34575a;

    public i3(Activity activity, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(activity);
        this.f34575a = c2VarArr;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.f34575a;
        if (c2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), c2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
