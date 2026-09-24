package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sj0 extends wl0 {
    public final ak0 X2;

    public sj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = ak0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ak0 ak0Var = this.X2;
        fb0 fb0Var = ak0Var.J;
        if (fb0Var != null) {
            fb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        ak0Var.j();
    }
}
