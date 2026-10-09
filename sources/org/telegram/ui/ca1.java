package org.telegram.ui;

import android.content.Context;
public final class ca1 extends org.telegram.ui.Components.qm0 {
    public int V2;
    public final bb1 W2;

    public ca1(bb1 bb1Var, Context context) {
        super(context, null);
        this.W2 = bb1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ga1 ga1Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (ga1Var = this.W2.X) != null) {
            ga1Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
