package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class zh extends r00 {
    public final di J;

    public zh(Context context, org.telegram.ui.ActionBar.f6 f6Var, di diVar) {
        super(context, f6Var);
        this.J = diVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.h1(this.f37557r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
