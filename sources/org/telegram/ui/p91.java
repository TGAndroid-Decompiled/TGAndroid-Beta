package org.telegram.ui;

import android.content.Context;
public final class p91 extends org.telegram.ui.Components.rl0 {
    public int U2;
    public final oa1 V2;

    public p91(oa1 oa1Var, Context context) {
        super(context, null);
        this.V2 = oa1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        t91 t91Var;
        super.onMeasure(i10, i11);
        if (this.U2 != getMeasuredHeight() && (t91Var = this.V2.U) != null) {
            t91Var.l();
        }
        this.U2 = getMeasuredHeight();
    }
}
