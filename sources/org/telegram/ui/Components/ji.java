package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ji extends x10 {
    public final ni F;

    public ji(Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var);
        this.F = niVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.F.t1(this.f34546r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
