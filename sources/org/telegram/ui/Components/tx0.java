package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class tx0 extends org.telegram.ui.Cells.d8 {
    public final ux0 L;

    public tx0(ux0 ux0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.L = ux0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ux0 ux0Var = this.L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ux0Var.f31745r.L, 1073741824), View.MeasureSpec.makeMeasureSpec(ux0Var.f31745r.L, 1073741824));
    }
}
