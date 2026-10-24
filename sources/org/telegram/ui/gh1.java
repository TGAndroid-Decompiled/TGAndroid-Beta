package org.telegram.ui;

import android.content.Context;
public final class gh1 extends org.telegram.ui.Components.voip.b1 {
    public final nh1 V;

    public gh1(nh1 nh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = nh1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        nh1 nh1Var = this.V;
        nh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], nh1Var.Y.getMeasuredWidth()};
    }
}
