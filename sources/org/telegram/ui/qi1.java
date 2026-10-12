package org.telegram.ui;

import android.content.Context;
public final class qi1 extends org.telegram.ui.Components.voip.e1 {
    public final xi1 V;

    public qi1(xi1 xi1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = xi1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        xi1 xi1Var = this.V;
        xi1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], xi1Var.Y.getMeasuredWidth()};
    }
}
