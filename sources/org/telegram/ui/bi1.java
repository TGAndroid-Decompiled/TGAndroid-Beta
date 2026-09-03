package org.telegram.ui;

import android.content.Context;
public final class bi1 extends org.telegram.ui.Components.voip.b1 {
    public final ii1 S;

    public bi1(ii1 ii1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.S = ii1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ii1 ii1Var = this.S;
        ii1Var.V.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ii1Var.V.getMeasuredWidth()};
    }
}
