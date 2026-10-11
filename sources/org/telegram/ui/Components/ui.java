package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ui extends t20 {
    public final yi J;

    public ui(Context context, org.telegram.ui.ActionBar.d6 d6Var, yi yiVar) {
        super(context, d6Var);
        this.J = yiVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.w1(this.f30964r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
