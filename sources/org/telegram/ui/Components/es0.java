package org.telegram.ui.Components;

import android.content.Context;
public final class es0 extends org.telegram.ui.Cells.q1 {
    public final int f33464kd = 1;

    public es0(Context context, int i3) {
        super(context, i3);
    }

    @Override
    public int getParentWidth() {
        int i3;
        int L;
        switch (this.f33464kd) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i3 = getMeasuredWidth();
                    L = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i3 = org.telegram.messenger.g0.f22608q.x;
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                return i3 - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override
    public final boolean isPressed() {
        switch (this.f33464kd) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public es0(Context context, int i3, boolean z10, k4.j jVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, z10, jVar, e6Var);
    }
}
