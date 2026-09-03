package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class t4 extends FrameLayout {
    public final org.telegram.ui.Cells.y1[] f28894a;

    public t4(Context context, org.telegram.ui.Cells.y1[] y1VarArr) {
        super(context);
        this.f28894a = y1VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.y1[] y1VarArr = this.f28894a;
        if (y1VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, AndroidUtilities.dp(7.0f) + y1VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
