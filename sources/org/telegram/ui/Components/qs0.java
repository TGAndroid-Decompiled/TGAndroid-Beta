package org.telegram.ui.Components;

import android.content.Context;
public final class qs0 extends org.telegram.ui.Cells.r1 {
    public final int f38995zd = 1;

    public qs0(Context context, int i7) {
        super(context, i7);
    }

    @Override
    public int getParentWidth() {
        int i7;
        int L;
        switch (this.f38995zd) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i7 = getMeasuredWidth();
                    L = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i7 = org.telegram.messenger.g0.f24226q.x;
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                return i7 - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override
    public final boolean isPressed() {
        switch (this.f38995zd) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public qs0(Context context, int i7, boolean z10, h6.m mVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, z10, mVar, i6Var);
    }
}
