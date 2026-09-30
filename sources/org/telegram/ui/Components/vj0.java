package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class vj0 extends zl0 {
    public final dk0 f29129e3;

    public vj0(dk0 dk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f29129e3 = dk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        dk0 dk0Var = this.f29129e3;
        ib0 ib0Var = dk0Var.J;
        if (ib0Var != null) {
            ib0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        dk0Var.j();
    }
}
