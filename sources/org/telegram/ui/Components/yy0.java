package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yy0 extends org.telegram.ui.Cells.f8 {
    public final zy0 O;

    public yy0(zy0 zy0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.O = zy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        zy0 zy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(zy0Var.f33526r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(zy0Var.f33526r.O, 1073741824));
    }
}
