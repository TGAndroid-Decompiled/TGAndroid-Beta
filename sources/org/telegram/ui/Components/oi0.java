package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class oi0 extends uk0 {
    public final wi0 f29145e3;

    public oi0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f29145e3 = wi0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        wi0 wi0Var = this.f29145e3;
        da0 da0Var = wi0Var.J;
        if (da0Var != null) {
            da0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        wi0Var.j();
    }
}
