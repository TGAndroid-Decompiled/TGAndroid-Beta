package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class q90 extends org.telegram.ui.ActionBar.y0 {
    public final int W;

    public q90(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(i3, context, e6Var, z10, z11);
        this.W = i10;
    }

    @Override
    public final void l() {
        switch (this.W) {
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
        switch (this.W) {
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
