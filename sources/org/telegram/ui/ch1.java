package org.telegram.ui;

import android.content.Context;
public final class ch1 extends org.telegram.ui.Components.voip.b1 {
    public final jh1 V;

    public ch1(jh1 jh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = jh1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        jh1 jh1Var = this.V;
        jh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], jh1Var.Y.getMeasuredWidth()};
    }
}
