package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class na0 extends org.telegram.ui.ActionBar.g1 {
    public final int H;

    public na0(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(i9, context, b6Var, z10, z11);
        this.H = i10;
    }

    @Override
    public final void i() {
        switch (this.H) {
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
        switch (this.H) {
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
