package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ik0 extends nm0 {
    public final qk0 f29378f3;

    public ik0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f29378f3 = qk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qk0 qk0Var = this.f29378f3;
        nb0 nb0Var = qk0Var.J;
        if (nb0Var != null) {
            nb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        qk0Var.j();
    }
}
