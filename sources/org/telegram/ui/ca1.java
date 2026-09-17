package org.telegram.ui;

import android.content.Context;
public final class ca1 extends org.telegram.ui.Components.ll0 {
    public int X2;
    public final bb1 Y2;

    public ca1(bb1 bb1Var, Context context) {
        super(context, null);
        this.Y2 = bb1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ga1 ga1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (ga1Var = this.Y2.X) != null) {
            ga1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
