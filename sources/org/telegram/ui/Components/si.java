package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class si extends e20 {
    public final wi J;

    public si(Context context, org.telegram.ui.ActionBar.e6 e6Var, wi wiVar) {
        super(context, e6Var);
        this.J = wiVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.q1(this.f23850r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
