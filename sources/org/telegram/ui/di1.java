package org.telegram.ui;

import android.content.Context;
public final class di1 extends org.telegram.ui.Components.voip.d1 {
    public final ki1 V;

    public di1(ki1 ki1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ki1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ki1 ki1Var = this.V;
        ki1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ki1Var.Y.getMeasuredWidth()};
    }
}
