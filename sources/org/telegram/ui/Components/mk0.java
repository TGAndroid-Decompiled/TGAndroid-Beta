package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class mk0 extends qm0 {
    public final uk0 V2;

    public mk0(uk0 uk0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V2 = uk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        uk0 uk0Var = this.V2;
        vb0 vb0Var = uk0Var.J;
        if (vb0Var != null) {
            vb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        uk0Var.j();
    }
}
