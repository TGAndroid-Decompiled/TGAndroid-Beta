package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class w90 extends org.telegram.ui.ActionBar.z0 {
    public final int V;

    public w90(int i7, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10) {
        super(i7, context, g6Var, z9, z10);
        this.V = i10;
    }

    @Override
    public final void l() {
        switch (this.V) {
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
        switch (this.V) {
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
