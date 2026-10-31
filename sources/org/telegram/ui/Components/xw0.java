package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xw0 extends org.telegram.ui.Cells.d8 {
    public final yw0 O;

    public xw0(yw0 yw0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, false);
        this.O = yw0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        yw0 yw0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(yw0Var.f32816r.F1, 1073741824), View.MeasureSpec.makeMeasureSpec(yw0Var.f32816r.F1, 1073741824));
    }
}
