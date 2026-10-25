package org.telegram.ui;

import android.content.Context;
public final class ih1 extends org.telegram.ui.Components.voip.b1 {
    public final ph1 V;

    public ih1(ph1 ph1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ph1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ph1 ph1Var = this.V;
        ph1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ph1Var.Y.getMeasuredWidth()};
    }
}
