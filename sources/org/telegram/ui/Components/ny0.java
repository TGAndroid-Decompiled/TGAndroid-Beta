package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ny0 extends org.telegram.ui.Cells.e8 {
    public final oy0 O;

    public ny0(oy0 oy0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.O = oy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        oy0 oy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(oy0Var.f29433r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(oy0Var.f29433r.O, 1073741824));
    }
}
