package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class zh extends s00 {
    public final di J;

    public zh(Context context, org.telegram.ui.ActionBar.g6 g6Var, di diVar) {
        super(context, g6Var);
        this.J = diVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.h1(this.f37857r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
