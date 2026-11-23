package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ew0 extends org.telegram.ui.Cells.z7 {
    public final fw0 P;

    public ew0(fw0 fw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false);
        this.P = fw0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        fw0 fw0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(fw0Var.f35215r.J1, 1073741824), View.MeasureSpec.makeMeasureSpec(fw0Var.f35215r.J1, 1073741824));
    }
}
