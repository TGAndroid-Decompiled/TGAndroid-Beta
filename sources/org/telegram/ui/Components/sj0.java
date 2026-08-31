package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sj0 extends tl0 {
    public final ak0 U2;

    public sj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = ak0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ak0 ak0Var = this.U2;
        xa0 xa0Var = ak0Var.G;
        if (xa0Var != null) {
            xa0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        ak0Var.j();
    }
}
