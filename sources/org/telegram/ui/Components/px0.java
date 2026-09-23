package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class px0 extends org.telegram.ui.Cells.g8 {
    public final qx0 O;

    public px0(qx0 qx0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = qx0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qx0 qx0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(qx0Var.f27479r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(qx0Var.f27479r.O, 1073741824));
    }
}
