package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z4 extends FrameLayout {
    public final org.telegram.ui.Cells.z1[] f29583a;

    public z4(Context context, org.telegram.ui.Cells.z1[] z1VarArr) {
        super(context);
        this.f29583a = z1VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.z1[] z1VarArr = this.f29583a;
        if (z1VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, AndroidUtilities.dp(7.0f) + z1VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
