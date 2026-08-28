package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u4 extends FrameLayout {
    public final org.telegram.ui.Cells.z1[] f32915a;

    public u4(Context context, org.telegram.ui.Cells.z1[] z1VarArr) {
        super(context);
        this.f32915a = z1VarArr;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        org.telegram.ui.Cells.z1[] z1VarArr = this.f32915a;
        if (z1VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, AndroidUtilities.dp(7.0f) + z1VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
