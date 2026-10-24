package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l50 extends org.telegram.ui.Cells.d4 {
    public final o50 f39116g0;

    public l50(o50 o50Var, Context context) {
        super(context);
        this.f39116g0 = o50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        u50 u50Var = this.f39116g0.M;
        u50 u50Var2 = u50.D3;
        u50Var.G1(d4Var);
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
