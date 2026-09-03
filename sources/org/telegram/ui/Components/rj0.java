package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rj0 extends sl0 {
    public final zj0 U2;

    public rj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = zj0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        zj0 zj0Var = this.U2;
        xa0 xa0Var = zj0Var.G;
        if (xa0Var != null) {
            xa0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        zj0Var.j();
    }
}
