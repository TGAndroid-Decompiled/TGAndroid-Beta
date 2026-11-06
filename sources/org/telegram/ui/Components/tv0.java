package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class tv0 extends org.telegram.ui.Cells.z7 {
    public final uv0 O;

    public tv0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = uv0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        uv0 uv0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(uv0Var.f38731r.F1, 1073741824), View.MeasureSpec.makeMeasureSpec(uv0Var.f38731r.F1, 1073741824));
    }
}
