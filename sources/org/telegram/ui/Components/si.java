package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class si extends c20 {
    public final wi J;

    public si(Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var);
        this.J = wiVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.t1(this.f23161r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
