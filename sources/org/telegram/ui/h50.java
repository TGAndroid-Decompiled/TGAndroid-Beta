package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h50 extends org.telegram.ui.Cells.d4 {
    public final k50 f37500f0;

    public h50(k50 k50Var, Context context) {
        super(context);
        this.f37500f0 = k50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        q50 q50Var = this.f37500f0.M;
        q50 q50Var2 = q50.D3;
        q50Var.G1(d4Var);
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
