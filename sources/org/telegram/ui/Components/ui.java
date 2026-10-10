package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ui extends t20 {
    public final yi J;

    public ui(Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(context, e6Var);
        this.J = yiVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.w1(this.f30958r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
