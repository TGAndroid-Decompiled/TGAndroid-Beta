package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pi extends k20 {
    public final ti J;

    public pi(Context context, org.telegram.ui.ActionBar.g6 g6Var, ti tiVar) {
        super(context, g6Var);
        this.J = tiVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.z1(this.f27836r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
