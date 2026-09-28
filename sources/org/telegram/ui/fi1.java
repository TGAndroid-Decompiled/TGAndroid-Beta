package org.telegram.ui;

import android.content.Context;
public final class fi1 extends org.telegram.ui.Components.voip.d1 {
    public final mi1 V;

    public fi1(mi1 mi1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = mi1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        mi1 mi1Var = this.V;
        mi1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], mi1Var.Y.getMeasuredWidth()};
    }
}
