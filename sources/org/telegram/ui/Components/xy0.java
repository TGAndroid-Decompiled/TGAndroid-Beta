package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xy0 extends org.telegram.ui.Cells.i8 {
    public final yy0 O;

    public xy0(yy0 yy0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false);
        this.O = yy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        yy0 yy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(yy0Var.f35151r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(yy0Var.f35151r.O, 1073741824));
    }
}
