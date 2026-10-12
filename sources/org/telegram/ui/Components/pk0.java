package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class pk0 extends wm0 {
    public final xk0 V2;

    public pk0(xk0 xk0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = xk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        xk0 xk0Var = this.V2;
        zb0 zb0Var = xk0Var.J;
        if (zb0Var != null) {
            zb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        xk0Var.j();
    }
}
