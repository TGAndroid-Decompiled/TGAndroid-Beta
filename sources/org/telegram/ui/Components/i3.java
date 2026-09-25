package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends FrameLayout {
    public final org.telegram.ui.Cells.a2[] f24934a;

    public i3(Activity activity, org.telegram.ui.Cells.a2[] a2VarArr) {
        super(activity);
        this.f24934a = a2VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.a2[] a2VarArr = this.f24934a;
        if (a2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, AndroidUtilities.dp(7.0f) + a2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
