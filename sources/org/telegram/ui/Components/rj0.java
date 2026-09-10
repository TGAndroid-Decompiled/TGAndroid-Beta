package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rj0 extends vl0 {
    public final zj0 X2;

    public rj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = zj0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        zj0 zj0Var = this.X2;
        db0 db0Var = zj0Var.J;
        if (db0Var != null) {
            db0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        zj0Var.j();
    }
}
