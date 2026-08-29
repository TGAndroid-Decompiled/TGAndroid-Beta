package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class dx extends qx {
    public final fz c3;

    public dx(fz fzVar, Context context) {
        super(fzVar, context);
        this.c3 = fzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.c3.f28592f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
