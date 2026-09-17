package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rx0 extends org.telegram.ui.Cells.f8 {
    public final sx0 O;

    public rx0(sx0 sx0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = sx0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        sx0 sx0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(sx0Var.f27953r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(sx0Var.f27953r.O, 1073741824));
    }
}
