package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class cc0 extends org.telegram.ui.ActionBar.e1 {
    public final int V;

    public cc0(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(i10, context, g6Var, z10, z11);
        this.V = i11;
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
