package org.telegram.ui;

import android.content.Context;
public final class li1 extends org.telegram.ui.Components.voip.d1 {
    public final si1 V;

    public li1(si1 si1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = si1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        si1 si1Var = this.V;
        si1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], si1Var.Y.getMeasuredWidth()};
    }
}
