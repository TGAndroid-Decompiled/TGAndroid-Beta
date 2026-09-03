package org.telegram.ui;

import android.content.Context;
public final class o91 extends org.telegram.ui.Components.sl0 {
    public int U2;
    public final na1 V2;

    public o91(na1 na1Var, Context context) {
        super(context, null);
        this.V2 = na1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        s91 s91Var;
        super.onMeasure(i10, i11);
        if (this.U2 != getMeasuredHeight() && (s91Var = this.V2.U) != null) {
            s91Var.l();
        }
        this.U2 = getMeasuredHeight();
    }
}
