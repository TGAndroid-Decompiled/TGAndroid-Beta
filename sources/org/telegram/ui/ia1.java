package org.telegram.ui;

import android.content.Context;
public final class ia1 extends org.telegram.ui.Components.mm0 {
    public int V2;
    public final hb1 W2;

    public ia1(hb1 hb1Var, Context context) {
        super(context, null);
        this.W2 = hb1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ma1 ma1Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (ma1Var = this.W2.X) != null) {
            ma1Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
