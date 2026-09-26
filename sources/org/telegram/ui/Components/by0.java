package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class by0 extends org.telegram.ui.Cells.f8 {
    public final cy0 O;

    public by0(cy0 cy0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = cy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        cy0 cy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(cy0Var.f23435r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(cy0Var.f23435r.O, 1073741824));
    }
}
