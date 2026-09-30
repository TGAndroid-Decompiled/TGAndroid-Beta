package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dy0 extends org.telegram.ui.Cells.f8 {
    public final ey0 O;

    public dy0(ey0 ey0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = ey0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ey0 ey0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ey0Var.f24078r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(ey0Var.f24078r.O, 1073741824));
    }
}
