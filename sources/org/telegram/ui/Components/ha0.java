package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ha0 extends org.telegram.ui.ActionBar.z0 {
    public final int W;

    public ha0(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(i7, context, i6Var, z10, z11);
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
