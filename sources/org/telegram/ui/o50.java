package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o50 extends org.telegram.ui.Cells.i4 {
    public final r50 f41973g0;

    public o50(r50 r50Var, Context context) {
        super(context);
        this.f41973g0 = r50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.i4 i4Var) {
        x50 x50Var = this.f41973g0.M;
        x50 x50Var2 = x50.D3;
        x50Var.G1(i4Var);
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
