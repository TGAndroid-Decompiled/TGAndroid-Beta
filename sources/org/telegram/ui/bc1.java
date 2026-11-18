package org.telegram.ui;

import android.content.Context;
public final class bc1 extends org.telegram.ui.Components.voip.c1 {
    public final hc1 W;

    public bc1(hc1 hc1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.W = hc1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        hc1 hc1Var = this.W;
        hc1Var.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], hc1Var.Z.getMeasuredWidth()};
    }
}
