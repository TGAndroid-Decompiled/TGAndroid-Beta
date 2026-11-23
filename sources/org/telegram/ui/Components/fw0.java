package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fw0 extends org.telegram.ui.Cells.a8 {
    public final gw0 P;

    public fw0(gw0 gw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false);
        this.P = gw0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        gw0 gw0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gw0Var.f35645r.J1, 1073741824), View.MeasureSpec.makeMeasureSpec(gw0Var.f35645r.J1, 1073741824));
    }
}
