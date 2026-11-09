package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class i3 extends FrameLayout {
    public final int f34541a;
    public final org.telegram.ui.Cells.c2[] f34542b;

    public i3(Context context, org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
        super(context);
        this.f34541a = i7;
        this.f34542b = c2VarArr;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f34541a) {
            case 0:
                super.onMeasure(i7, i10);
                org.telegram.ui.Cells.c2[] c2VarArr = this.f34542b;
                if (c2VarArr[0] != null) {
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    setMeasuredDimension(measuredWidth, org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + measuredHeight);
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.f34542b;
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
