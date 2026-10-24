package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hk0 extends lm0 {
    public final pk0 Y2;

    public hk0(pk0 pk0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = pk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pk0 pk0Var = this.Y2;
        nb0 nb0Var = pk0Var.J;
        if (nb0Var != null) {
            nb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pk0Var.j();
    }
}
