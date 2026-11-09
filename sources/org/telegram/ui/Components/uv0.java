package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class uv0 extends org.telegram.ui.Cells.z7 {
    public final vv0 O;

    public uv0(vv0 vv0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.O = vv0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        vv0 vv0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(vv0Var.f39816r.F1, 1073741824), View.MeasureSpec.makeMeasureSpec(vv0Var.f39816r.F1, 1073741824));
    }
}
