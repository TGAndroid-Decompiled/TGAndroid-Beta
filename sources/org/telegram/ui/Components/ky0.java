package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ky0 extends org.telegram.ui.Cells.e8 {
    public final ly0 O;

    public ky0(ly0 ly0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = ly0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ly0 ly0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ly0Var.f28337r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(ly0Var.f28337r.O, 1073741824));
    }
}
