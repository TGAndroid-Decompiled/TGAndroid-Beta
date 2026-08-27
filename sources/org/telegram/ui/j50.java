package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class j50 extends org.telegram.ui.Cells.b4 {

    public final m50 f39255b0;

    public j50(m50 m50Var, Context context) {
        super(context);
        this.f39255b0 = m50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.b4 b4Var) {
        s50 s50Var = this.f39255b0.I;
        s50 s50Var2 = s50.f42409z3;
        s50Var.F1(b4Var);
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
