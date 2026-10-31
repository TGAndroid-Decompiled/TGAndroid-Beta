package org.telegram.ui.Components;

import android.content.Context;
public final class ft0 extends org.telegram.ui.Cells.q1 {
    public final int f26133hd = 1;

    public ft0(Context context, int i10) {
        super(context, i10);
    }

    @Override
    public int getParentWidth() {
        int i10;
        int L;
        switch (this.f26133hd) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i10 = getMeasuredWidth();
                    L = org.telegram.messenger.i0.L(24.0f);
                } else {
                    i10 = org.telegram.messenger.i0.f16026q.x;
                    L = org.telegram.messenger.i0.L(24.0f);
                }
                return i10 - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override
    public final boolean isPressed() {
        switch (this.f26133hd) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public ft0(Context context, int i10, boolean z10, li.k kVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, z10, kVar, p6Var);
    }
}
