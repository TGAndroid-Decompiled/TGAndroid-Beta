package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class by0 extends org.telegram.ui.Cells.g8 {
    public final cy0 O;

    public by0(cy0 cy0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = cy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        cy0 cy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(cy0Var.f23436r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(cy0Var.f23436r.O, 1073741824));
    }
}
