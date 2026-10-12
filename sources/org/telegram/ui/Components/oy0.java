package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class oy0 extends org.telegram.ui.Cells.f8 {
    public final py0 O;

    public oy0(py0 py0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.O = py0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        py0 py0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(py0Var.f28450r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(py0Var.f28450r.O, 1073741824));
    }
}
