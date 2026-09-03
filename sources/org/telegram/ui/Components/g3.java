package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g3 extends FrameLayout {
    public final org.telegram.ui.Cells.y1[] f25028a;

    public g3(Activity activity, org.telegram.ui.Cells.y1[] y1VarArr) {
        super(activity);
        this.f25028a = y1VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.y1[] y1VarArr = this.f25028a;
        if (y1VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, AndroidUtilities.dp(7.0f) + y1VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
