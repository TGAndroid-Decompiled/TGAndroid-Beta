package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class fb0 extends org.telegram.ui.ActionBar.f1 {
    public final int L;

    public fb0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(i10, context, d6Var, z10, z11);
        this.L = i11;
    }

    @Override
    public final void i() {
        switch (this.L) {
            case 0:
                setBackground(null);
                return;
            default:
                setBackground(null);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                if (getVisibility() == 0 && getAlpha() >= 0.5f) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                if (getVisibility() == 0 && getAlpha() >= 0.5f) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
