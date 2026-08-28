package org.telegram.ui;

import android.content.Context;
public final class fh1 extends org.telegram.ui.Components.voip.a1 {
    public final mh1 R;

    public fh1(mh1 mh1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.R = mh1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        mh1 mh1Var = this.R;
        mh1Var.U.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], mh1Var.U.getMeasuredWidth()};
    }
}
