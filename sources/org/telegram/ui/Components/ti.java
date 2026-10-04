package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ti extends f20 {
    public final xi J;

    public ti(Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(context, d6Var);
        this.J = xiVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.s1(this.f26252r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
