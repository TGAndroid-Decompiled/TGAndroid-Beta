package org.telegram.ui;

import android.content.Context;
public final class i91 extends org.telegram.ui.Components.tl0 {
    public int U2;
    public final ha1 V2;

    public i91(ha1 ha1Var, Context context) {
        super(context, null);
        this.V2 = ha1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        m91 m91Var;
        super.onMeasure(i10, i11);
        if (this.U2 != getMeasuredHeight() && (m91Var = this.V2.U) != null) {
            m91Var.l();
        }
        this.U2 = getMeasuredHeight();
    }
}
