package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a60 extends org.telegram.ui.Cells.d4 {
    public final d60 f34369f0;

    public a60(d60 d60Var, Context context) {
        super(context);
        this.f34369f0 = d60Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        j60 j60Var = this.f34369f0.M;
        j60 j60Var2 = j60.D3;
        j60Var.F1(d4Var);
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
