package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dw0 extends org.telegram.ui.Cells.z7 {
    public final ew0 P;

    public dw0(ew0 ew0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false);
        this.P = ew0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ew0 ew0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ew0Var.f34815r.J1, 1073741824), View.MeasureSpec.makeMeasureSpec(ew0Var.f34815r.J1, 1073741824));
    }
}
