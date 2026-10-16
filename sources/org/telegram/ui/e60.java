package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e60 extends org.telegram.ui.Cells.e4 {
    public final h60 f35209f0;

    public e60(h60 h60Var, Context context) {
        super(context);
        this.f35209f0 = h60Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        n60 n60Var = this.f35209f0.M;
        n60 n60Var2 = n60.D3;
        n60Var.G1(e4Var);
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
