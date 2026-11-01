package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yw0 extends org.telegram.ui.Cells.d8 {
    public final zw0 O;

    public yw0(zw0 zw0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, false);
        this.O = zw0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        zw0 zw0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(zw0Var.f33245r.F1, 1073741824), View.MeasureSpec.makeMeasureSpec(zw0Var.f33245r.F1, 1073741824));
    }
}
