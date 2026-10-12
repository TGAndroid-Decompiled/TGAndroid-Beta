package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ri extends o20 {
    public final vi J;

    public ri(Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context, c6Var);
        this.J = viVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.w1(this.f27815r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
