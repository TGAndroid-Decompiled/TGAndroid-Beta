package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f50 extends org.telegram.ui.Cells.e4 {
    public final i50 f38144b0;

    public f50(i50 i50Var, Context context) {
        super(context);
        this.f38144b0 = i50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        o50 o50Var = this.f38144b0.I;
        o50 o50Var2 = o50.f40880z3;
        o50Var.F1(e4Var);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i9)), 1073741824), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }
}
