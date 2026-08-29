package org.telegram.ui;

import android.content.Context;
public final class hh1 extends org.telegram.ui.Components.voip.b1 {
    public final oh1 R;

    public hh1(oh1 oh1Var, Context context, float f9, float f10) {
        super(context, f9, f10);
        this.R = oh1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        oh1 oh1Var = this.R;
        oh1Var.U.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], oh1Var.U.getMeasuredWidth()};
    }
}
