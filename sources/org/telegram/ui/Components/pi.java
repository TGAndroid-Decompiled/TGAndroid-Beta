package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pi extends m20 {
    public final ti J;

    public pi(Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(context, u6Var);
        this.J = tiVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.y1(this.f30365r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
