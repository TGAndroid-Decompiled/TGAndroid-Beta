package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sx0 extends org.telegram.ui.Cells.d8 {
    public final tx0 L;

    public sx0(tx0 tx0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.L = tx0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        tx0 tx0Var = this.L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tx0Var.f31438r.L, 1073741824), View.MeasureSpec.makeMeasureSpec(tx0Var.f31438r.L, 1073741824));
    }
}
