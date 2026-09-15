package org.telegram.ui;

import android.content.Context;
public final class mi1 extends org.telegram.ui.Components.voip.d1 {
    public final ti1 V;

    public mi1(ti1 ti1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ti1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ti1 ti1Var = this.V;
        ti1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ti1Var.Y.getMeasuredWidth()};
    }
}
