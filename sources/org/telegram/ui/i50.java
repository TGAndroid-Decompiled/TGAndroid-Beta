package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i50 extends org.telegram.ui.Cells.c4 {
    public final l50 f39128b0;

    public i50(l50 l50Var, Context context) {
        super(context);
        this.f39128b0 = l50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.c4 c4Var) {
        r50 r50Var = this.f39128b0.I;
        r50 r50Var2 = r50.f41867z3;
        r50Var.F1(c4Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
