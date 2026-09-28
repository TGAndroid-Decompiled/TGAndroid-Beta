package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class uj0 extends yl0 {
    public final ck0 X2;

    public uj0(ck0 ck0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = ck0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ck0 ck0Var = this.X2;
        hb0 hb0Var = ck0Var.J;
        if (hb0Var != null) {
            hb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        ck0Var.j();
    }
}
