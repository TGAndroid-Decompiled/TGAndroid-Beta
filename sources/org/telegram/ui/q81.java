package org.telegram.ui;

import android.content.Context;
public final class q81 extends org.telegram.ui.Components.im0 {
    public int V2;
    public final p91 W2;

    public q81(p91 p91Var, Context context) {
        super(context, null);
        this.W2 = p91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        u81 u81Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (u81Var = this.W2.X) != null) {
            u81Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
