package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m50 extends org.telegram.ui.Cells.i4 {
    public final p50 f41464g0;

    public m50(p50 p50Var, Context context) {
        super(context);
        this.f41464g0 = p50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.i4 i4Var) {
        v50 v50Var = this.f41464g0.M;
        v50 v50Var2 = v50.D3;
        v50Var.G1(i4Var);
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
