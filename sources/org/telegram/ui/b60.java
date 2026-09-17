package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b60 extends org.telegram.ui.Cells.d4 {
    public final e60 f32056f0;

    public b60(e60 e60Var, Context context) {
        super(context);
        this.f32056f0 = e60Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        k60 k60Var = this.f32056f0.M;
        k60 k60Var2 = k60.D3;
        k60Var.F1(d4Var);
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
