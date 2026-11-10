package org.telegram.ui;

import android.content.Context;
public final class dc1 extends org.telegram.ui.Components.voip.z0 {
    public final jc1 V;

    public dc1(jc1 jc1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.V = jc1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        jc1 jc1Var = this.V;
        jc1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], jc1Var.Y.getMeasuredWidth()};
    }
}
