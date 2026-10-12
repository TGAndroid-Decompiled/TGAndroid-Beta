package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wi extends v20 {
    public final aj J;

    public wi(Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar) {
        super(context, c6Var);
        this.J = ajVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.w1(this.f31362r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
