package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class px0 extends org.telegram.ui.Cells.f8 {
    public final qx0 O;

    public px0(qx0 qx0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = qx0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qx0 qx0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(qx0Var.f29863r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(qx0Var.f29863r.O, 1073741824));
    }
}
