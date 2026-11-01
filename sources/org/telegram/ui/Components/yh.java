package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class yh extends h10 {
    public final bi J;

    public yh(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var);
        this.J = biVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.g1(this.f26635r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
