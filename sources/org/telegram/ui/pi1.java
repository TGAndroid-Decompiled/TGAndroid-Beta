package org.telegram.ui;

import android.content.Context;
public final class pi1 extends org.telegram.ui.Components.voip.d1 {
    public final wi1 V;

    public pi1(wi1 wi1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = wi1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        wi1 wi1Var = this.V;
        wi1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], wi1Var.Y.getMeasuredWidth()};
    }
}
