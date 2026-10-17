package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ek0 extends im0 {
    public final mk0 V2;

    public ek0(mk0 mk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = mk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        mk0 mk0Var = this.V2;
        ob0 ob0Var = mk0Var.J;
        if (ob0Var != null) {
            ob0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        mk0Var.j();
    }
}
