package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class yh extends r00 {
    public final ci J;

    public yh(Context context, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar) {
        super(context, h6Var);
        this.J = ciVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.h1(this.f37446r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
