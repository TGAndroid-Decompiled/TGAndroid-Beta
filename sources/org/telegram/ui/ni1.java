package org.telegram.ui;

import android.content.Context;
public final class ni1 extends org.telegram.ui.Components.voip.b1 {
    public final ui1 V;

    public ni1(ui1 ui1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ui1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ui1 ui1Var = this.V;
        ui1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ui1Var.Y.getMeasuredWidth()};
    }
}
