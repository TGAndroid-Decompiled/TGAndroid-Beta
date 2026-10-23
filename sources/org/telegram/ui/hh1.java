package org.telegram.ui;

import android.content.Context;
public final class hh1 extends org.telegram.ui.Components.voip.b1 {
    public final oh1 V;

    public hh1(oh1 oh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = oh1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        oh1 oh1Var = this.V;
        oh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], oh1Var.Y.getMeasuredWidth()};
    }
}
