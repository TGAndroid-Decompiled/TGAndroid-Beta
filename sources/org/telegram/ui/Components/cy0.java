package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class cy0 extends org.telegram.ui.Cells.g8 {
    public final dy0 O;

    public cy0(dy0 dy0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = dy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        dy0 dy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dy0Var.f22508r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(dy0Var.f22508r.O, 1073741824));
    }
}
