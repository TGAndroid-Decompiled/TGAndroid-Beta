package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends FrameLayout {
    public final org.telegram.ui.Cells.z1[] f23507a;

    public h3(Activity activity, org.telegram.ui.Cells.z1[] z1VarArr) {
        super(activity);
        this.f23507a = z1VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.z1[] z1VarArr = this.f23507a;
        if (z1VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, AndroidUtilities.dp(7.0f) + z1VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
