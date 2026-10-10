package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ty0 extends org.telegram.ui.Cells.f8 {
    public final uy0 O;

    public ty0(uy0 uy0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.O = uy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        uy0 uy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(uy0Var.f31668r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(uy0Var.f31668r.O, 1073741824));
    }
}
