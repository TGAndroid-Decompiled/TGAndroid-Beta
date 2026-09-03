package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class hb0 extends org.telegram.ui.ActionBar.g1 {
    public final int I;

    public hb0(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(i10, context, f6Var, z4, z10);
        this.I = i11;
    }

    @Override
    public final void i() {
        switch (this.I) {
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
        switch (this.I) {
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
