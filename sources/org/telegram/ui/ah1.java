package org.telegram.ui;

import android.content.Context;
public final class ah1 extends org.telegram.ui.Components.voip.b1 {
    public final hh1 V;

    public ah1(hh1 hh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = hh1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        hh1 hh1Var = this.V;
        hh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], hh1Var.Y.getMeasuredWidth()};
    }
}
