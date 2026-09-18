package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ij0 extends ml0 {
    public final qj0 X2;

    public ij0(qj0 qj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = qj0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qj0 qj0Var = this.X2;
        ta0 ta0Var = qj0Var.J;
        if (ta0Var != null) {
            ta0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        qj0Var.j();
    }
}
