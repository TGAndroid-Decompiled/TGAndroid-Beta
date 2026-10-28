package org.telegram.ui;

import android.content.Context;
public final class kh1 extends org.telegram.ui.Components.voip.b1 {
    public final rh1 V;

    public kh1(rh1 rh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = rh1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        rh1 rh1Var = this.V;
        rh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], rh1Var.Y.getMeasuredWidth()};
    }
}
