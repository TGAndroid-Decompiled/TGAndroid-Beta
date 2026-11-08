package org.telegram.ui.Components;

import android.content.Context;
public final class fs0 extends org.telegram.ui.Cells.q1 {
    public final int f33642ld = 1;

    public fs0(Context context, int i7) {
        super(context, i7);
    }

    @Override
    public int getParentWidth() {
        int i7;
        int L;
        switch (this.f33642ld) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i7 = getMeasuredWidth();
                    L = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i7 = org.telegram.messenger.g0.f22563q.x;
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                return i7 - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override
    public final boolean isPressed() {
        switch (this.f33642ld) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public fs0(Context context, int i7, boolean z9, h6.m mVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, z9, mVar, f6Var);
    }
}
