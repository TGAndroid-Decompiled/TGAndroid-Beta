package org.telegram.ui;

import android.content.Context;
public final class h91 extends org.telegram.ui.Components.sl0 {
    public int U2;
    public final ga1 V2;

    public h91(ga1 ga1Var, Context context) {
        super(context, null);
        this.V2 = ga1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l91 l91Var;
        super.onMeasure(i10, i11);
        if (this.U2 != getMeasuredHeight() && (l91Var = this.V2.U) != null) {
            l91Var.l();
        }
        this.U2 = getMeasuredHeight();
    }
}
