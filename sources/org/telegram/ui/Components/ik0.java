package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ik0 extends mm0 {
    public final qk0 V2;

    public ik0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = qk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qk0 qk0Var = this.V2;
        ub0 ub0Var = qk0Var.J;
        if (ub0Var != null) {
            ub0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        qk0Var.j();
    }
}
