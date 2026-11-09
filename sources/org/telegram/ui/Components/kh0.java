package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kh0 extends qj0 {
    public final sh0 f35344e3;

    public kh0(sh0 sh0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f35344e3 = sh0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        sh0 sh0Var = this.f35344e3;
        m90 m90Var = sh0Var.J;
        if (m90Var != null) {
            m90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        sh0Var.j();
    }
}
