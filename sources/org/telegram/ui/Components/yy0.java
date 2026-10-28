package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yy0 extends org.telegram.ui.Cells.i8 {
    public final zy0 O;

    public yy0(zy0 zy0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false);
        this.O = zy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        zy0 zy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(zy0Var.f35470r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(zy0Var.f35470r.O, 1073741824));
    }
}
