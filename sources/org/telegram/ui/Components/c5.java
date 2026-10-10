package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c5 extends FrameLayout {
    public final org.telegram.ui.Cells.a2[] f25188a;

    public c5(Context context, org.telegram.ui.Cells.a2[] a2VarArr) {
        super(context);
        this.f25188a = a2VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.a2[] a2VarArr = this.f25188a;
        if (a2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, AndroidUtilities.dp(7.0f) + a2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
