package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ii extends d20 {
    public final mi G;

    public ii(Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var);
        this.G = miVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.t1(this.f26132r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
