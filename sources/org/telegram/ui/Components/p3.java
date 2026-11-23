package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class p3 extends FrameLayout {
    public final int f38463a;
    public final org.telegram.ui.Cells.d2[] f38464b;

    public p3(Context context, org.telegram.ui.Cells.d2[] d2VarArr, int i7) {
        super(context);
        this.f38463a = i7;
        this.f38464b = d2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f38463a) {
            case 0:
                super.onMeasure(i7, i10);
                org.telegram.ui.Cells.d2[] d2VarArr = this.f38464b;
                if (d2VarArr[0] != null) {
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + d2VarArr[0].getMeasuredHeight() + measuredHeight);
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                org.telegram.ui.Cells.d2[] d2VarArr2 = this.f38464b;
                if (d2VarArr2[0] != null) {
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    setMeasuredDimension(measuredWidth2, org.telegram.messenger.g0.L(7.0f) + d2VarArr2[0].getMeasuredHeight() + measuredHeight2);
                    return;
                }
                return;
        }
    }
}
