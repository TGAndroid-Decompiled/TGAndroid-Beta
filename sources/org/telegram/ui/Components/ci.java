package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

public final class ci extends p10 {
    public final gi F;

    public ci(Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(context, c6Var);
        this.F = giVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.F.t1(this.f31468r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
