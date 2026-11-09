package org.telegram.ui;

import android.content.Context;
public final class cc1 extends org.telegram.ui.Components.voip.z0 {
    public final ic1 V;

    public cc1(ic1 ic1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.V = ic1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ic1 ic1Var = this.V;
        ic1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ic1Var.Y.getMeasuredWidth()};
    }
}
