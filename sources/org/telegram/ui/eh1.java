package org.telegram.ui;

import android.content.Context;

public final class eh1 extends org.telegram.ui.Components.voip.a1 {
    public final lh1 R;

    public eh1(lh1 lh1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.R = lh1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        lh1 lh1Var = this.R;
        lh1Var.U.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], lh1Var.U.getMeasuredWidth()};
    }
}
