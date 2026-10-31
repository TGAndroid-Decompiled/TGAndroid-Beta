package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class g3 extends FrameLayout {
    public final int f26242a;
    public final org.telegram.ui.Cells.c2[] f26243b;

    public g3(Context context, org.telegram.ui.Cells.c2[] c2VarArr, int i10) {
        super(context);
        this.f26242a = i10;
        this.f26243b = c2VarArr;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f26242a) {
            case 0:
                super.onMeasure(i10, i11);
                org.telegram.ui.Cells.c2[] c2VarArr = this.f26243b;
                if (c2VarArr[0] != null) {
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    setMeasuredDimension(measuredWidth, org.telegram.messenger.i0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.f26243b;
                if (c2VarArr2[0] != null) {
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    setMeasuredDimension(measuredWidth2, org.telegram.messenger.i0.L(7.0f) + c2VarArr2[0].getMeasuredHeight() + measuredHeight2);
                    return;
                }
                return;
        }
    }
}
