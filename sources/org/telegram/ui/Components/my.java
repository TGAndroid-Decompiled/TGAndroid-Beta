package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class my extends org.telegram.ui.Cells.d8 {
    public final int O;

    public my(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, z10);
        this.O = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.O) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(82.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(82.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(82.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(82.0f), 1073741824));
                return;
        }
    }
}
