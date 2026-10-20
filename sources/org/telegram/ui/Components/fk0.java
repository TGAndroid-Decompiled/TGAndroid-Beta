package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fk0 extends jm0 {
    public final nk0 V2;

    public fk0(nk0 nk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = nk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        nk0 nk0Var = this.V2;
        ob0 ob0Var = nk0Var.J;
        if (ob0Var != null) {
            ob0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        nk0Var.j();
    }
}
