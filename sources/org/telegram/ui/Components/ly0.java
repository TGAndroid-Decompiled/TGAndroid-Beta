package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ly0 extends org.telegram.ui.Cells.f8 {
    public final my0 O;

    public ly0(my0 my0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = my0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        my0 my0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(my0Var.f28759r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(my0Var.f28759r.O, 1073741824));
    }
}
