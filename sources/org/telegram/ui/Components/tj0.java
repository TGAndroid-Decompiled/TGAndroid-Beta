package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class tj0 extends xl0 {
    public final bk0 X2;

    public tj0(bk0 bk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = bk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bk0 bk0Var = this.X2;
        gb0 gb0Var = bk0Var.J;
        if (gb0Var != null) {
            gb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        bk0Var.j();
    }
}
