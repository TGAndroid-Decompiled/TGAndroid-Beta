package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class g3 extends FrameLayout {
    public final int f33946a;
    public final org.telegram.ui.Cells.c2[] f33947b;

    public g3(Context context, org.telegram.ui.Cells.c2[] c2VarArr, int i3) {
        super(context);
        this.f33946a = i3;
        this.f33947b = c2VarArr;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f33946a) {
            case 0:
                super.onMeasure(i3, i10);
                org.telegram.ui.Cells.c2[] c2VarArr = this.f33947b;
                if (c2VarArr[0] != null) {
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
                    return;
                }
                return;
            default:
                super.onMeasure(i3, i10);
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.f33947b;
                if (c2VarArr2[0] != null) {
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    setMeasuredDimension(measuredWidth2, org.telegram.messenger.g0.L(7.0f) + c2VarArr2[0].getMeasuredHeight() + measuredHeight2);
                    return;
                }
                return;
        }
    }
}
